# Controle de Alunos - Aplicação com Pilhas Estáticas  
Este projeto consiste em uma aplicação de controle de alunos desenvolvida utilizando JAVA, onde os dados dos estudantes são armazenados em duas estruturas de dados do tipo TAD PE (Pilha Estática): ```PE_1``` para alunos do sexo feminino (F) e ```PE_2``` para alunos do sexo masculino (M).  
  
# Funcionalidades  
A aplicação oferece as seguintes funcionalidades:  
  
1. **Iniciar (init)**: Cria as pilhas vazias.  
2. **Destruir (destroy)**: Libera a memória alocada pelas pilhas.  
3. **Empilhar (push)**: Adiciona um aluno à pilha correspondente (PE_1 ou PE_2).  
4. **Desempilhar (pop)**: Remove o aluno do topo da pilha.  
5. **Topo (topo)**: Retorna o aluno no topo da pilha sem removê-lo.  
6. **Verificar se está vazia (isEmpty)**: Verifica se a pilha está vazia.  
7. **Verificar se está cheia (isFull)**: Verifica se a pilha está cheia.  
  
# Representação dos Alunos  
Cada aluno é representado por uma estrutura com os seguintes atributos:  
  
**Nome**: Nome completo do aluno.  
**Matrícula**: Número de matrícula do aluno.  
**Sexo**: Indicação do sexo do aluno (F para feminino, M para masculino).  
  
# Funcionamento  
O usuário insere os dados dos alunos (nome, matrícula e sexo).  
Os alunos do sexo feminino (F) são empilhados na ```PE_1```, enquanto os alunos do sexo masculino (M) são empilhados na ```PE_2```.  
Após a entrada dos 20 alunos, a aplicação desempilha todos os alunos de ambas as pilhas e exibe seus dados na tela.  
  
# Observações  
Certifique-se de declarar a estrutura de aluno no programa principal.  
A aplicação deve ser desenvolvida em uma linguagem de programação de sua escolha.  
Este projeto visa demonstrar o uso de pilhas estáticas para controle de dados de alunos.  
