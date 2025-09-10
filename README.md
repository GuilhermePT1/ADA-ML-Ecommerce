# ADA-ML-Ecommerce

Um projeto simples de gestão de pedidos em JAVA, utilizando POO, enum, interface e princípios de SOLID.

O projeto simula um pequeno e-commerce, permitindo as seguintes funções:

- 👤 Cadastro de clientes
- 📦 Cadastro de produtos
- 🧾 Criação de pedidos com vários itens
- 💰 Cálculo automático do valor total do pedido
- 🔄 CONtrole do status do pedido: (Aberto -> Aguardadndo_Pagamento -> Pago -> Enviado)

🛠️ Tecnologia Utilizadas:
- ☕︎ JAVA
- Enum para controle de status
- Interface + implementação de memória (repositório)
- Princípios básico de SOLID (SRP, OCP, LSP e DIP)

📂 Estrutura do projeto:

src/
-- Cliente
-- Produto
-- ItemPedido
-- Pedido
-- StatusPedido
-- Repositorio
-- SaveRepositorio
-- Main

▶️ Clonagem desse Repositório:

-- https://github.com/GuilhermePT1/ADA-ML-Ecommerce.git
-- Compile e execute a classe Main

🖥️ Exemplo de saída:

--- Ada Commerce ---

--- Cadastro de Clientes ---
Cliente salvo: Nome= Guilherme, documento=159357468-20, email=guiparracho@hotmail.com
Cliente salvo: Nome= Ana, documento=123456789-00, email=anatorres@gmail.com

--- Cadastro de Produtos ---
Cliente salvo: Produto: nome= Teclado, preco R$: 250.0
Cliente salvo: Produto: nome= Placa de video, preco R$: 1500.0

--- Listagem de Clientes ---
Nome= Guilherme, documento=159357468-20, email=guiparracho@hotmail.com
Nome= Ana, documento=123456789-00, email=anatorres@gmail.com

--- Listagem de Produtos ---
Produto: nome= Teclado, preco R$: 250.0
Produto: nome= Placa de video, preco R$: 1500.0

--- Criação de Pedido ---
Status do pedido: Aberto
Item adicionado: Teclado
Item adicionado: Placa de video
Total do pedido: R$ 16250.0
* Processo do pedido
Status do pedido: Aguardando_Pagamento
* Processando pagamento...
Status do pedido: Pago
* Enviando pedido...
Status do pedido: Enviado

--- Fim do Programa ---

Obrigado por comprar na Ada Commerce!
