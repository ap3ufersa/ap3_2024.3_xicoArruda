### U3 - Aula 8 - 20/12/2024 - Herança, Polimorfismo, Exceptions (5,0)

### Exercício Resolvido

1. Crie uma classe `Pessoa` que tenha o atributo nome. Crie uma classe `Aluno` que herda de `Pessoa` e tem três notas. Crie a classe `NotaInvalidaException`. Use todas as classes em `TestaPessoa` e `TestaAluno`.

```mermaid
classDiagram
    namespace package_aluno {
        class Pessoa {
            - nome: String 
            // get, set, toString()
        }

        class Aluno {
            - nota1 : double
            - nota2 : double
            - nota3 : double
            // get, set, toString()
        }

        class TestaAluno {
            + void main()
        }
    }

    Aluno --|> Pessoa : é_um
    TestaAluno ..> Aluno : usa
```

### Exercícios em Sala

Gabaritos para ajudar no exercícios [aqui](../unidade3_aula8/).

Faça _commit_ e _push_. Entregue a folha assinada!
