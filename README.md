# ADA-ML-Ecommerce

Um projeto simples de gestão de pedidos em JAVA, utilizando POO, enum, interface e princípios de SOLID.

O projeto simula um pequeno e-commerce, permitindo as seguintes funções:

- 👤 Cadastro de clientes
- 📦 Cadastro de produtos
- 📦 Departamentos
- 🧾 Criação de pedidos com vários itens
- 💰 Cálculo automático do valor total do pedido
- 🔄 Controle do status do pedido: (Aberto -> Aguardando_Pagamento -> Pago -> Enviado)
- 💰 Cupom de Descontos para os pedidos

🛠️ Tecnologia Utilizadas:
- ☕︎ JAVA
- Enum para controle de status
- Interface + implementação de memória (repositório)
- Princípios básicos de SOLID (SRP, OCP, LSP e DIP)
- Stream

📂 Estrutura do projeto:

src/
-- Cliente
-- CupomDeDesconto
-- Departamento
-- ItemPedido
-- Produto
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

Cliente salvo: Guilherme, Documento: 159357468-20, Email: guiparracho@hotmail.com

Cliente salvo: Ana, Documento: 123456789-00, Email: anatorres@gmail.com

--- Cadastro de Produtos ---

Produto salvo: Teclado (R$ 250.0)

Produto salvo: Placa de vídeo (R$ 3500.0)

Produto salvo: Livro Java Efetivo (R$ 120.0)

--- Listagem de Clientes ---

Nome= Guilherme, documento=159357468-20, email=guiparracho@hotmail.com

Nome= Ana, documento=123456789-00, email=anatorres@gmail.com

--- Listagem de Produtos ---

Produto: nome= Teclado, preco R$: 250.0

Produto: nome= Placa de video, preco R$: 1500.0

--- Criação de Pedido por Departamento ---

Departamento: ELETRONICO
- Teclado (Qtd: 2, Total: R$ 500.0)
- Placa de vídeo (Qtd: 1, Total: R$ 3500.0)
Total do departamento: R$ 4000.0

Departamento: LIVROS
- Livro Java Efetivo (Qtd: 3, Total: R$ 360.0)
Total do departamento: R$ 360.0

Valor total do pedido (com desconto): R$ 3924.0
Cupom aplicado: Gui10 | Válido? Sim

--- Fim do Programa ---
