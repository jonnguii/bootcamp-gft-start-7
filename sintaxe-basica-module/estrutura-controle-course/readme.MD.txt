# 📚 Estudo: [Estrutura de Controle em Java]

## 🎯 Objetivo
Aprimorar e revisar meu conhecimento em Estruturas de Controle:
- Laços de repetição [do, do-while e for]
- Condicionais (if, else e switch-case)

## ✍️ Resumo

### ✨ O que aprendi

- Revisei meus conceitos nas estruturas abordadas;
- Aprendi sobre o novo "switch-case" utilizado
- Aprendi sobre a keyword "continue" dentro de loops
- Uma nova forma de criar condições pra loops [while (true)]
- Revisei o operador ternário

---

### 🧠 Conceitos importantes

- 🔴 switch tradicional:
java
```
switch (opcao) {
	case 1: 
	System.out.println("Um");
	break;

	case 2:
	System.out.println("Dois");
	break;
    default:
	System.out.println("Outro");
}

```

- 🟢 switch moderno com ->:
java
```
switch (opcao) {
	case 1 -> System.out.println("Um");
	case 2 -> System.out.println("Dois");
	case 3, 4 -> System.out.println("Três");
	default -> System.out.println("Outro");
}

```

Caso quisermos usar mais de 1 linha, ou seja, mais de uma instrução dentro de um case com ->, adicionamos o yield e chaves {}

🟢 Exemplo com múltiplas linhas e yield:

java 
```
String resultado = switch (dia) {
    case 1 -> {
        System.out.println("Domingo");
        yield "Fim de semana";
    }
    case 2, 3, 4, 5, 6 -> {
        System.out.println("Dia útil");
        yield "Trabalho";
    }
    case 7 -> {
        System.out.println("Sábado");
        yield "Fim de semana";
    }
    default -> "Dia inválido";
};
```
🔍 Explicação:

O switch-case moderno não necessita de break, ele o inclui de forma inteligente.
Caso queremos trabalhar com atribuição de valor no switch case, precisamos passar uma keyword de retorno (!return), que no caso é o [yield]. Também precisamos colocar tudo dentro de chaves.


- [Continue]
Essa keyword utilizada em loops, faz com que ignoremos o restante do código e voltemos ao inicio do loop que está sendo repetido.

Exemplo em código:

java 
```
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue; // pula o 3
    }
    System.out.println(i);
}

Saída:
1
2
4
5         //o programa nao imprimiu o (i) e retornou ao inicio do for

```


- [Operador ternário]
Uma versão de um if/else com a seguinte assinatura:

Condição ? valor1 : valor2

Exemplo em código:

java 
```
String day = option == 1 ? "Domingo" : "Sábado";
```

---



## 🚀 Materiais e Referências
- [https://web.dio.me/track/gft-start-7-java/course/estruturas-de-controle-em-java/learning]


Estudo realizado como parte do meu plano de desenvolvimento pessoal! 🚀✨
