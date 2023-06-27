// IMPORTANTE: As funções "gets" e "print" são acessíveis globalmente, onde: 
// - "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
// - "print": imprime um texto de saída (output) e pula uma linha ("\n") automaticamente;
 
let somaDasNotas = 0; 
let contador = 0; 

do { 
     let notaEntradaConsole = parseFloat(gets()); 

     // TODO: Crie as condições necessárias para resolver o desafio e imprima, no final, a média formatando com 2 casas decimais.
    
    if(notaEntradaConsole < 0 || notaEntradaConsole > 10) {
      print("nota invalida");
    } else {
      contador++;
      somaDasNotas += notaEntradaConsole;
    }
}while (contador < 2); 

media = somaDasNotas / 2;

print("media = " + media.toFixed(2));
