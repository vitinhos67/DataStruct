import subprocess

# Configuração dos tamanhos de dados e ordens de inserção
data_sizes = [100, 1000, 10000]
orders = [1, 2, 3]  # 1 - Aleatória, 2 - Ordenada, 3 - Inversamente Ordenada

# Operações do menu
operations = {
    "first": 1,                # Buscar primeiro elemento
    "last": 2,                 # Buscar último elemento
    "ordering_quick": (3, 1),  # QuickSort
    "ordering_bubble": (3, 2), # BubbleSort
    "insertion_random": (4, 1),# Inserção Aleatória
    "insertion_ordered": (4, 2),# Inserção Ordenada
    "insertion_reverse": (4, 3),# Inserção Inversa
    "middle": 5,               # Buscar elemento do meio
    "find_value": 6            # Encontrar valor
}

def run_java_test(operation, size, order, repeat=5):
    """
    Executa o programa Java e coleta as saídas.
    :param operation: Operação a ser testada.
    :param size: Tamanho dos dados a serem gerados.
    :param order: Ordem dos dados (1-3).
    :param repeat: Número de repetições do teste.
    :return: Lista com as saídas do programa.
    """
    results = []

    for _ in range(repeat):
        # Define as entradas baseadas na operação
        inputs = ""
        if isinstance(operations[operation], tuple):
            inputs = f"{operations[operation][0]}\n{size}\n{operations[operation][1]}\n"
        else:
            inputs = f"{operations[operation]}\n{size}\n{order}\n"

        # Executa o programa Java
        process = subprocess.run(
            ["java", "Main"],  # Certifique-se de que Main.java está compilado
            input=inputs,
            text=True,
            capture_output=True
        )

        # Captura a saída do programa
        if process.returncode != 0:
            print(f"Erro ao executar o teste: {process.stderr}")
        results.append(process.stdout.strip())

    return results

def main():
    """
    Automação de testes para o programa Java.
    """
    # Testar inserção e buscas
    for size in data_sizes:
        for order in orders:
            print(f"Testando com tamanho {size} e ordem {order}...")

            # Testes de Inserção
            for insertion_type in ["insertion_random", "insertion_ordered", "insertion_reverse"]:
                insertion_results = run_java_test(insertion_type, size, order)
                print(f"\nResultados de Inserção ({insertion_type}):")
                for result in insertion_results:
                    print(result)

            # Testes de Ordenação
            for sorting_type in ["ordering_quick", "ordering_bubble"]:
                sorting_results = run_java_test(sorting_type, size, order)
                print(f"\nResultados de Ordenação ({sorting_type}):")
                for result in sorting_results:
                    print(result)

            # Testes de Busca
            for search_op in ["first", "last", "middle"]:
                search_results = run_java_test(search_op, size, order)
                print(f"\nResultados de Busca ({search_op}):")
                for result in search_results:
                    print(result)

if __name__ == "__main__":
    main()
