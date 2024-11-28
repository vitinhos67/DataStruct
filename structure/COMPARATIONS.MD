## Inserção

- Ordernada
- Inversamente Ordenada
- Aleatoria

## Busca

- Primeiro elemento - ok
- Ultimo Elemento - ok
- Elemento do meio - ok
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
      <tr><td>1</td><td>65993 ns</td></tr>
      <tr><td>2</td><td>44184 ns</td></tr>
      <tr><td>3</td><td>104524 ns</td></tr>
      <tr><td>4</td><td>55499 ns</td></tr>
      <tr><td>5</td><td>64468 ns</td></tr>
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
      <tr><td>1</td><td>4133 ns</td></tr>
      <tr><td>2</td><td>4298 ns</td></tr>
      <tr><td>3</td><td>9560 ns</td></tr>
      <tr><td>4</td><td>2599 ns</td></tr>
      <tr><td>5</td><td>4561 ns</td></tr>
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
      <tr><td>1</td><td>3952 ns</td></tr>
      <tr><td>2</td><td>2526 ns</td></tr>
      <tr><td>3</td><td>8446 ns</td></tr>
      <tr><td>4</td><td>4966 ns</td></tr>
      <tr><td>5</td><td>3580 ns</td></tr>
    </table>
    </div>
  </div>
</div>

## Elemento do meio

<div>
  <div >
    <h4>Vetor</h4>
    <div style="display:flex; gap:10px">
    <div style="display:block">
    <p>10 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>7317 ns</td></tr>
      <tr><td>2</td><td>4021 ns</td></tr>
      <tr><td>3</td><td>5701 ns</td></tr>
      <tr><td>4</td><td>4062 ns</td></tr>
      <tr><td>5</td><td>4480 ns</td></tr>
    </table>
    </div>
        <div style="display:block">
    <p>100 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>4952 ns</td></tr>
      <tr><td>2</td><td>44184 ns</td></tr>
      <tr><td>3</td><td>4871 ns</td></tr>
      <tr><td>4</td><td>8741 ns</td></tr>
      <tr><td>5</td><td>4952 ns</td></tr>
    </table>
    </div>
        <div style="display:block">
    <p>1000 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>10250 ns</td></tr>
      <tr><td>2</td><td>6009 ns</td></tr>
      <tr><td>3</td><td>3634 ns</td></tr>
      <tr><td>4</td><td>8019 ns</td></tr>
      <tr><td>5</td><td>8403 ns</td></tr>
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
      <tr><td>1</td><td>2552 ns</td></tr>
      <tr><td>2</td><td>2652 ns</td></tr>
      <tr><td>3</td><td>3485 ns</td></tr>
      <tr><td>4</td><td>2503 ns</td></tr>
      <tr><td>5</td><td>2606 ns</td></tr>
    </table>
    </div>
        <div style="display:block">
    <p>100 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>2581 ns</td></tr>
      <tr><td>2</td><td>13853 ns</td></tr>
      <tr><td>3</td><td>3374 ns</td></tr>
      <tr><td>4</td><td>3789 ns</td></tr>
      <tr><td>5</td><td>3042 ns</td></tr>
    </table>
    </div>
        <div style="display:block">
    <p>1000 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>8403 ns</td></tr>
      <tr><td>2</td><td>3922 ns</td></tr>
      <tr><td>3</td><td>1914 ns</td></tr>
      <tr><td>4</td><td>2867 ns</td></tr>
      <tr><td>5</td><td>2915 ns</td></tr>
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
      <tr><td>1</td><td>2535 ns</td></tr>
      <tr><td>2</td><td>2329 ns</td></tr>
      <tr><td>3</td><td>3021 ns</td></tr>
      <tr><td>4</td><td>2627 ns</td></tr>
      <tr><td>5</td><td>2708   ns</td></tr>
    </table>
    </div>
        <div style="display:block">
    <p>100 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>796 ns</td></tr>
      <tr><td>2</td><td>2743 ns</td></tr>
      <tr><td>3</td><td>3100 ns</td></tr>
      <tr><td>4</td><td>2952 ns</td></tr>
      <tr><td>5</td><td>3147 ns</td></tr>
    </table>
    </div>
        <div style="display:block">
    <p>1000 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>2190 ns</td></tr>
      <tr><td>2</td><td>1766 ns</td></tr>
      <tr><td>3</td><td>1672 ns</td></tr>
      <tr><td>4</td><td>2075 ns</td></tr>
      <tr><td>5</td><td>3338 ns</td></tr>
    </table>
    </div>
  </div>
</div>

## Valores inexistentes

<div>
  <div >
    <h4>Vetor</h4>
    <div style="display:flex; gap:10px">
    <div style="display:block">
    <p>10 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>3426 ns</td></tr>
      <tr><td>2</td><td>4048 ns</td></tr>
      <tr><td>3</td><td>2760 ns</td></tr>
      <tr><td>4</td><td>4257 ns</td></tr>
      <tr><td>5</td><td>3182 ns</td></tr>
    </table>
    </div>
        <div style="display:block">
    <p>100 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>9839 ns</td></tr>
      <tr><td>2</td><td>4968 ns</td></tr>
      <tr><td>3</td><td>40639 ns</td></tr>
      <tr><td>4</td><td>5057 ns</td></tr>
      <tr><td>5</td><td>5075 ns</td></tr>
    </table>
    </div>
        <div style="display:block">
    <p>1000 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>39685 ns</td></tr>
      <tr><td>2</td><td>16946 ns</td></tr>
      <tr><td>3</td><td>17556 ns</td></tr>
      <tr><td>4</td><td>27106 ns</td></tr>
      <tr><td>5</td><td>21366 ns</td></tr>
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
      <tr><td>1</td><td>6627 ns</td></tr>
      <tr><td>2</td><td>8665 ns</td></tr>
      <tr><td>3</td><td>5014 ns</td></tr>
      <tr><td>4</td><td>9575 ns</td></tr>
      <tr><td>5</td><td>6829 ns</td></tr>
    </table>
    </div>
        <div style="display:block">
    <p>100 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>7794 ns</td></tr>
      <tr><td>2</td><td>6594 ns</td></tr>
      <tr><td>3</td><td>5850 ns</td></tr>
      <tr><td>4</td><td>12193 ns</td></tr>
      <tr><td>5</td><td>5772 ns</td></tr>
    </table>
    </div>
        <div style="display:block">
    <p>1000 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>14043 ns</td></tr>
      <tr><td>2</td><td>5907 ns</td></tr>
      <tr><td>3</td><td>6136 ns</td></tr>
      <tr><td>4</td><td>10526 ns</td></tr>
      <tr><td>5</td><td>6469 ns</td></tr>
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
      <tr><td>1</td><td>3032 ns</td></tr>
      <tr><td>2</td><td>4520 ns</td></tr>
      <tr><td>3</td><td>2287 ns</td></tr>
      <tr><td>4</td><td>4764 ns</td></tr>
      <tr><td>5</td><td>3020 ns</td></tr>
    </table>
    </div>
        <div style="display:block">
    <p>100 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>2305 ns</td></tr>
      <tr><td>2</td><td>2743 ns</td></tr>
      <tr><td>3</td><td>2849 ns</td></tr>
      <tr><td>4</td><td>6157 ns</td></tr>
      <tr><td>5</td><td>2862 ns</td></tr>
    </table>
    </div>
        <div style="display:block">
    <p>1000 elementos</p>
    <table border="1">
      <tr><th>Testes</th><th>Tempo</th></tr>
      <tr><td>1</td><td>2827 ns</td></tr>
      <tr><td>2</td><td>3618 ns</td></tr>
      <tr><td>3</td><td>2941 ns</td></tr>
      <tr><td>4</td><td>2717 ns</td></tr>
      <tr><td>5</td><td>5019 ns</td></tr>
    </table>
    </div>
  </div>
</div>

