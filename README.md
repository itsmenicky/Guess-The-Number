<h1 align=center>Guess The Number 🤔</h1>

<p align=justify>É necessário que o algoritmo gere um número aleatório para ser adivinhado pelo usuário, para isso, me utilizei da biblioteca <strong>random</strong>, gerando um número aleatório entre 0 e 100 e armazenando no gerador <strong>generator</strong>.</p>

<p align=justify>Na classe principal, foi implementado uma tela de introdução do usuário ao jogo, e logo após um laço <strong>while</strong>, com a finalidade de pedir novamente um número ao usuário sempre que o número for diferente do número gerado pelo programa. Caso o usuário acerte o número, é mostrado uma mensagem de vitória no console e a escolha de jogar novamente, caso o usuário escolha 's' um novo número é gerado  e o laço se repete, caso 'n' o programa é encerrado.</p>

<p align=justify>Para auxiliar o usuário na descoberta do número, o jogo verifica o número inserido pelo usuário e compara com o número gerado, a fim de dar uma dica se é maior ou menor. Pensando que o usuário dará vários palpites e o jogo pode reiniciar várias vezes, foi implementado também a função <strong>clearConsole</strong>, que limpa a tela do console quando chamada durante a execução do programa.</p>
