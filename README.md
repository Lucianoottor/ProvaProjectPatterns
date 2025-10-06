# ProvaProjectPatterns

Questão 1: Sistema de Logística
Problema: Calcular tarifas de frete para diferentes modalidades de transporte (terrestre, aéreo, marítimo), cada uma com sua própria regra de cálculo.

Padrão Escolhido: Strategy

Justificativa: Permitir encapsular cada regra de cálculo em sua própria classe, permitindo que o sistema principal trate todas as modalidades de forma genérica, sem usar condicionais.

Questão 2: Plataforma de Pagamentos
Problema: Criar processadores para diferentes meios de pagamento (Cartão, Boleto, PIX) sem que o código cliente conheça os detalhes da criação de cada um.

Padrão Escolhido: Factory Method

Justificativa: Factory Method transfere a instanciação para a classe "fábrica", desacoplando o cliente das classes concretas. O cliente simplesmente solicita um processador de um tipo específico, e a fábrica decide qual objeto new instanciar e retornar.

Questão 3: Notificação em Site de Notícias
Problema: Notificar múltiplos leitores sempre que uma nova notícia for publicada em um tópico de interesse ao qual eles se inscreveram.

Padrão Escolhido: Observer

Justificativa: Este é o cenário clássico de "publicar/assinar" (publish-subscribe). O padrão Observer cria uma relação de um-para-muitos, onde um objeto (o Tópico) notifica automaticamente todos os seus dependentes (os Leitores) sobre qualquer mudança de estado, sem que o Tópico precise conhecer quem são os Leitores.

Questão 4: Relatórios com Funcionalidades Adicionais
Problema: Adicionar funcionalidades opcionais (estatísticas, gráficos, exportação PDF) a um relatório básico sem alterar seu código-fonte.

Padrão Escolhido: Decorator

Justificativa: Adicionar responsabilidades a um objeto de forma dinâmica. O padrão Decorator permite "envelopar" o objeto base com novas funcionalidades em tempo de execução. Isso oferece uma alternativa flexível à herança, evitando uma explosão de subclasses para cada combinação de recurso.

Questão 5: Modelos de Documentos
Problema: Criação rápida de novos documentos personalizáveis a partir de modelos pré-existentes, sem o custo de recriar a estrutura do zero.

Padrão Escolhido: Prototype

Justificativa: O padrão Prototype permite criar novos objetos copiando uma instância existente, desacoplando o cliente do processo de criação.
