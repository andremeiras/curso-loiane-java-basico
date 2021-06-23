# Métodos estáticos

* Um método estático não é instanciado. Apenas é permitido passar um valor como parâmetro.
* Um bom exemplo é a classe Math, onde utilizamos os métodos ```Math.random()```, ```Math.PI()```, ```Math.sqrt()```,  ```Math.pow()```, etc.

* Quando um método não é estático, é obrigatório instanciá-lo para ter acesso aos seus métodos
Exemplo: 

```java
Pessoa pessoa = new Pessoa();
pessoa.getNome();
pessoa.getCPF();
pessoa.imprimeDadosDaPessoa();
pessoa.calcularIdade();
```

Com um método estático, ao chamar a classe já é possível ter acesso aos seus métodos.

Exemplo: 

```java
Pessoa.getNome();
Pessoa.getCPF();
Pessoa.imprimeDadosDaPessoa();
Pessoa.calcularIdade();
```

Quando um método é estático, ao chamar outro método que está na mesma classe, este método também precisa ser estático.
Um exemplo prático é na classe principal que contém o método main() que é estático.

Exemplo:
```java
public static void main(String[] args) {
	olaMundo();
	calcularDoisNumeros(2, 3);
	isAtivo(1); // retornará true
}

static String olaMundo() {
	return "Olá, mundo!";
}

static int calcularDoisNumeros(int num1, int num2) {
	return num1 + num2;
}

static boolean isAtivo(int numeroDigitado) {
	// se o numeroDigitado for 1 = ativo / true
	// se o numeroDigitado for 0 = inativo / false
	if (numeroDigitado == 1) {
		return true;
	} else {
		return false;
	}
}
```




