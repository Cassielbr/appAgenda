# App Agenda
Um aplicativo Android para gerenciamento de contatos e agendamentos.


## 📱 Descrição
O App Agenda é um aplicativo Android que permite ao usuário gerenciar seus contatos e agendamentos. O usuário pode adicionar, editar e listar, facilitando a organização de informações importantes.

## 🔧 Funcionalidades

- [x] Adição de contatos
- [x] Listagem
- [x] Edição e remoção de contatos
- [x] Interface simples 

##🚀 Tecnologias Utilizadas

- [x] **Android Studio** (Bumblebee | 2024.1.2)
- [x] Java para desenvolvimento
- [x] RecyclerView para listagem de contatos
- [x] SQLite para armazenamento de dados
      
## 🛠️ Como Rodar o Projeto

Siga os passos abaixo para rodar o projeto localmente:

1. Clone este repositório:
    ```bash
    https://github.com/Cassielbr/AppBurger
    ```
2. Abra o projeto no Android Studio.

3. Compile e execute o projeto em um emulador ou dispositivo físico.

## 📂 Estrutura do Projeto

  ```bash
├── app
│   ├── src
│   │   ├── main
│   │   │   ├── java/br/ulbra/appagenda
│   │   │   │   ├── MainActivity.java             # Atividade principal com gerenciamento de contatos
│   │   │   │   ├── ListarPessoasActivity.java     # Atividade para listar contatos
│   │   │   │   ├── Pessoa.java                     # Modelo de dados da pessoa
│   │   │   │   ├── PessoaDAO.java                 # Classe para operações no banco de dados
│   │   │   │   ├── Conexao.java                 # Faz a conexão
│   │   │   ├── res
│   │   │   │   ├── layout
│   │   │   │   │   ├── activity_main.xml          # Layout da tela principal
│   │   │   │   │   ├── activity_listar_pessoa.xml # Layout da tela de listagem
│   │   │   │   ├── menu
│   │   │   │   │   ├── menu_contexto.xml          # Menu de contexto para ações com contatos
│   │   │   │   │   ├── menu_principal.xml          # Menu principal da aplicação
│   │   │   │   └── values
│   │   │   │       ├── strings.xml                 # Strings usadas no app
│   │   │   │       ├── colors.xml                  # Cores definidas no projeto
│   └── build.gradle                                 # Configuração do Gradle
└── README.md                                        # Este arquivo
  ```


# 🖥️ Telas do Aplicativo. 
# Tela Cadastro
![image](https://github.com/Cassielbr/appAgenda/blob/master/assets/Cadastro.png)

## Lista 
![image](https://github.com/Cassielbr/appAgenda/blob/master/assets/Listar%20Pessoas.png)


## Menus
![image](https://github.com/Cassielbr/appAgenda/blob/master/assets/menu1.png)

![image](https://github.com/Cassielbr/appAgenda/blob/master/assets/menu%20opçoes.png)



## 👨‍💻 Desenvolvedores – 
**Cassiel** - Desenvolvedor - [GitHub](https://github.com/Cassielbr)

## 📄 Licença 
Este projeto está licenciado sob os termos da licença MIT. Para mais detalhes, veja o arquivo [LICENSE](https://github.com/Cassielbr/appAgenda/blob/master/LICENSE).
