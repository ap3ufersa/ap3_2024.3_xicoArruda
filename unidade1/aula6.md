### U3 - Aula 8 - 20/12/2024 - Herança, Polimorfismo, Exceptions (5,0)

### Exercício Resolvido

1. Crie uma classe ```Pessoa``` que tenha o atributo nome. Crie uma classe ```Aluno``` que herda de ```Pessoa``` e tem três notas. Crie a classe NotaInvalidaException. Use todas as classes em ```TestaPessoa``` e ```TestaAluno```.

```mermaid
classDiagram
    namespace package_aluno {
        class Pessoa {
            - String nome
            //getters, setters, toString
        }

        class Aluno {
            - double nota1
            - double nota2
            - double nota3
            //getters, setters, toString
        }

        class NotaInvalidaException {
            + String getMessage()
        }

        class TestaAluno {
            + void main()
        }
    }
    Aluno "1..*" -- "1" Endereco : "tem"
    Aluno "1..*" -- "1" TestaAluno : "alunos"
    Aluno "1" -- "1" Pessoa : "é uma"
```

### Exercícios em Sala

Gabaritos para ajudar no exercícios [aqui](gabaritos).

Faça _commit_ e _push_. Entregue a folha assinada!
