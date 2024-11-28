## Busca Primeiro Elemento

<div>
  <div >
    <h4>Vetor</h4>
    <div style="display:flex; gap:10px">
    <div style="display:block">
    <p>100 Elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>92798 ns</td></tr>
      <tr><td>2</td><td>62291 ns</td></tr>
      <tr><td>3</td><td>199986 ns</td></tr>
      <tr><td>4</td><td>70974 ns</td></tr>
      <tr><td>5</td><td>31214 ns</td></tr>
    </table>
    </div>
        <div style="display:block">
    <p>1000 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>55195 ns</td></tr>
      <tr><td>2</td><td>72415 ns</td></tr>
      <tr><td>3</td><td>59566 ns</td></tr>
      <tr><td>4</td><td>70974 ns</td></tr>
      <tr><td>5</td><td>31214 ns</td></tr>
    </table>
    </div>
        <div style="display:block">
    <p>10000 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>51526 ns</td></tr>
      <tr><td>2</td><td>70868 ns</td></tr>
      <tr><td>3</td><td>92921 ns</td></tr>
      <tr><td>4</td><td>68811 ns</td></tr>
      <tr><td>5</td><td>62805 ns</td></tr>
    </table>
    </div>
  </div>
    <div >
    <h4>Arvore Binaria</h4>
    <div style="display:flex; gap:10px">
    <div style="display:block">
    <p>100 Elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>1911 ns</td></tr>
      <tr><td>2</td><td>3854 ns</td></tr>
      <tr><td>3</td><td>4124 ns</td></tr>
      <tr><td>4</td><td>3877 ns</td></tr>
      <tr><td>5</td><td>6363 ns</td></tr>
    </table>
    </div>
        <div style="display:block">
    <p>1000 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>4113 ns</td></tr>
      <tr><td>2</td><td>3911 ns</td></tr>
      <tr><td>3</td><td>7097 ns</td></tr>
      <tr><td>4</td><td>3938 ns</td></tr>
      <tr><td>5</td><td>3547 ns</td></tr>
    </table>
    </div>
        <div style="display:block">
    <p>10000 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>3928 ns</td></tr>
      <tr><td>2</td><td>3596 ns</td></tr>
      <tr><td>3</td><td>5088 ns</td></tr>
      <tr><td>4</td><td>5521 ns</td></tr>
      <tr><td>5</td><td>4083 ns</td></tr>
    </table>
    </div>
  </div>
    <div >
    <h4>Arvore AVL</h4>
    <div style="display:flex; gap:10px">
    <div style="display:block">
    <p>100- Elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>2817 ns</td></tr>
      <tr><td>2</td><td>4291 ns</td></tr>
      <tr><td>3</td><td>4111 ns</td></tr>
      <tr><td>4</td><td>4583 ns</td></tr>
      <tr><td>5</td><td>6993 ns</td></tr>
    </table>
    </div>
        <div style="display:block">
    <p>1000 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>3833 ns</td></tr>
      <tr><td>2</td><td>6900 ns</td></tr>
      <tr><td>3</td><td>6243 ns</td></tr>
      <tr><td>4</td><td>3436 ns</td></tr>
      <tr><td>5</td><td>3375 ns</td></tr>
    </table>
    </div>
        <div style="display:block">
    <p>10000 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>3858 ns</td></tr>
      <tr><td>2</td><td>5848 ns</td></tr>
      <tr><td>3</td><td>4592 ns</td></tr>
      <tr><td>4</td><td>3585 ns</td></tr>
      <tr><td>5</td><td>10286 ns</td></tr>
    </table>
    </div>
  </div>
</div>


<br/>
A diferença na média de tempos ocorre devido à complexidade e estrutura de cada algoritmo:

Vetor: É mais lento porque acessos a índices são 
𝑂
(
1
)
O(1), mas a variabilidade é causada pelo overhead de gerenciamento de memória ou condições do sistema.

Árvore Binária: É mais rápida, pois a busca do menor elemento é proporcional à profundidade (
𝑂
(
ℎ
)
O(h)). Como a profundidade aumenta moderadamente, o desempenho é mais consistente.

Árvore AVL: Apesar de ser balanceada (
𝑂
(
log
⁡
𝑛
)
O(logn)), o balanceamento adiciona um pequeno overhead, tornando-a ligeiramente mais lenta que a árvore binária em alguns casos.

Resumo: Vetores têm acesso direto, mas com overhead; árvores binárias e AVL aproveitam estruturas organizadas, mas AVL inclui custo adicional pelo balanceamento.
