## Inserção

- Ordernada
- Inversamente Ordenada
- Aleatoria

## Busca

- Primeiro elemento
- Ultimo Elemento
- Elemento do meio
- Valores aleatorios
- Valor inexistente

Para vetor

- Busca Sequencial
- Busca binaria (apenas para vetores ordenados)

Algoritimos de ordenação para vetor

- QuickSort
- BubbleSort


## Busca Primeiro Elemento

<div>
  <div >
    <h4>Vetor</h4>
    <div style="display:flex; gap:10px">
    <div style="display:block">
    <p>10 elementos</p>
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
    <p>100 elementos</p>
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
    <p>1000 elementos</p>
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
    <p>10 elementos</p>
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
    <p>100 elementos</p>
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
    <p>1000 elementos</p>
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
    <p>10 elementos</p>
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
    <p>100 elementos</p>
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
    <p>1000 elementos</p>
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

## Ultimo Elemento

<div>
  <div >
    <h4>Vetor</h4>
    <div style="display:flex; gap:10px">
    <div style="display:block">
    <p>10 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>40119 ns</td></tr>
      <tr><td>2</td><td>65957 ns</td></tr>
      <tr><td>3</td><td>55555 ns</td></tr>
      <tr><td>4</td><td>37777 ns</td></tr>
      <tr><td>5</td><td>53651 ns</td></tr>
    </table>
    </div>
        <div style="display:block">
    <p>100 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>54548 ns</td></tr>
      <tr><td>2</td><td>83653 ns</td></tr>
      <tr><td>3</td><td>35142 ns</td></tr>
      <tr><td>4</td><td>36416 ns</td></tr>
      <tr><td>5</td><td>96899 ns</td></tr>
    </table>
    </div>
        <div style="display:block">
    <p>1000 elementos</p>
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
    <p>10 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>4746 ns</td></tr>
      <tr><td>2</td><td>7042 ns</td></tr>
      <tr><td>3</td><td>3948 ns</td></tr>
      <tr><td>4</td><td>3879 ns</td></tr>
      <tr><td>5</td><td>4289 ns</td></tr>
    </table>
    </div>
        <div style="display:block">
    <p>100 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>3139 ns</td></tr>
      <tr><td>2</td><td>5875 ns</td></tr>
      <tr><td>3</td><td>5875 ns</td></tr>
      <tr><td>4</td><td>1994 ns</td></tr>
      <tr><td>5</td><td>3872 ns</td></tr>
    </table>
    </div>
        <div style="display:block">
    <p>1000 elementos</p>
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
    <p>10 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>4346 ns</td></tr>
      <tr><td>2</td><td>4080 ns</td></tr>
      <tr><td>3</td><td>3405 ns</td></tr>
      <tr><td>4</td><td>6912 ns</td></tr>
      <tr><td>5</td><td>3996 ns</td></tr>
    </table>
    </div>
        <div style="display:block">
    <p>100 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>3411 ns</td></tr>
      <tr><td>2</td><td>2735 ns</td></tr>
      <tr><td>3</td><td>4849 ns</td></tr>
      <tr><td>4</td><td>1816 ns</td></tr>
      <tr><td>5</td><td>3411 ns</td></tr>
    </table>
    </div>
        <div style="display:block">
    <p>1000 elementos</p>
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
