### U2 - Aula 4 - 06/12/2024 - Lista ligada, datas, Scanner (1,0)

### Exercícios Resolvidos

1. Lista de Alunos e Scanner: Crie uma classe ```Aluno``` que tenha os atributos nome e três notas. Implemente métodos para calcular a média das notas e para verificar se o aluno foi aprovado (média maior ou igual a 7.0) ou reprovado. Adicione métodos para exibir o nome do aluno em letras maiúsculas e minúsculas. Implemente/gere automagicamente getters, setters e toString. Crie uma classe ```TestaAluno``` para instanciar 5 alunos, cujas informações devem ser lidas do usuário via **Scanner**, armazenadas em um **ArrayList** e exibidas posteriormente com o nome, média e status de aprovação de cada aluno. 

```mermaid
classDiagram
    namespace package_aluno {
        class Aluno {
            - String nome
            - double nota1
            - double nota2
            - double nota3
            + String getNome()
            + void setNome(String nome)
            + double getNota1()
            + void setNota1(double nota)
            + double getNota2()
            + void setNota2(double nota)
            + double getNota3()
            + void setNota3(double nota)
            + String toString()
            + double calcularMedia()
            + boolean isAprovadoMedia()
            + String exibirNomeMaiusculo()
            + String exibirNomeMinusculo()
        }

        class TestaAluno {
            +void main()
            - ArrayList<Aluno> osAlunos
            + void lerAlunosViaScanner()
        }
    }
    Aluno "1..*" -- "1" TestaAluno : "alunos"
```


### Exercícios em Sala

Após concluir cada questão, faça _commit_ localmente e sincronize-o (_push_) com o seu repositório remoto no GitHub. Conforme [figura](https://drive.google.com/open?id=1dV5TwUdMxSmh80sx13epVcJFewIT_MVk).

Gabaritos para ajudar no exercícios [aqui](gabaritos).

Entregue a folha assinada!