### U2 - Aula 7 - 19/12/2024 - Visibilidade, Composição (3,0)

### Exercício Resolvido

1. Crie uma classe ```Aluno``` que tenha os atributos nome e três notas. Crie a classe Endereço, com Rua e Cidade. Cada aluno tem apenas 1 endereço. Componha as classes e teste na classe ```TestaAluno```. 

```mermaid
classDiagram
    namespace package_aluno {
        class Aluno {
            - String nome
            - double nota1
            - double nota2
            - double nota3
            - Endereco endereco
            //getters, setters, toString
        }

        class Endereco {
            - String rua
            - String cidade
            //getters, setters, toString
        }

        class TestaAluno {
            + void main()
        }
    }
    Aluno "1..*" -- "1" Endereco : "tem"
    Aluno "1..*" -- "1" TestaAluno : "alunos"
```

### Exercícios em Sala

Gabaritos para ajudar no exercícios [aqui](gabaritos).

Faça _commit_ e _push_. Entregue a folha assinada!
