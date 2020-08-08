#language: pt
Funcionalidade: Calculo do Imposto de Renda
  Eu como pessoa física
  Desejo declarar os meus bens
  Para que eu possa saber qual o valor do imposto que eu tenho a restituir ou a pagar

  Esquema do Cenario: Verificar se o imposto é calculado corretamente pela API
    Dado que tenho os seguintes bens <TabelaFipe>
    Quando submeto os meus bens para cálculo do imposto
    Entao devo obter o valor de imposto equivalente a R$ <ResultadoEsperado>

    Exemplos:
      | TabelaFipe |
      | 55500      |
      | 60000      |

