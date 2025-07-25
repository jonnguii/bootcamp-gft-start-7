## 📚 Aula: [Padrões de desenvolvimento e conceitos]

> Módulo: [sintaxe-basica-module]  
> Curso: [fundamentos-java-course]


### ✨ O que revisei:

### Indentação

➤ Em Java, a indentação não afeta a execução do código (diferente do Python).

➤ Porém, manter uma boa identação é essencial para a legibilidade.

### Padrões de nomenclatura

✅ camelCase → utilizado para métodos e variáveis

✅ PascalCase → utilizado para nomes de classes

✅ UPPER_SNAKE_CASE → utilizado para constantes

### Pacotes

➤ Devem ser nomeados com o domínio invertido (ex: br.com.dio)

### Comentários

// → comentário de linha única

/* ... */ → comentário de múltiplas linhas

---

### 🧠 Conceitos importantes

### Importação de bibliotecas

➤ Utilizamos import para acessar funcionalidades de outras bibliotecas.

### Classe String

➤ Strings em Java são objetos da classe String.

### Entrada de dados

➤ Utilizamos a classe Scanner da biblioteca java.util para realizar saída de dados:

System.out.print() → saída na mesma linha do terminal

System.out.println() → saída quebrando uma linha

System.out.printf() → formatação com %s (texto), %d (número inteiro) etc.

---

### ⚙️ Tipagem da linguagem

### Fortemente tipada

➤ Todo tipo de dado deve ser declarado na compilação.

### Estática

➤ Uma vez declarado o tipo de uma variável, ele não pode ser alterado.

### Dinamicamente tipada (≠ Java)

➤ Em linguagens dinâmicas, o tipo pode ser alterado (ex: Python, JavaScript).

```
Java:
var value1 = "joão" ✅ certo! o Java se baseia no valor atribuido e autodeclara a tipagem de forma abstraida
value 1 = 20 ❌ erro! o Java não permite alterar o tipo uma vez declarado [estático]

```
---

### 🧪 Palavra-chave var

Permite autodeclaração de tipo: o compilador identifica o tipo baseado no valor atribuído.

Ainda assim, Java continua sendo estaticamente tipado – o tipo não pode mudar depois de atribuído.
