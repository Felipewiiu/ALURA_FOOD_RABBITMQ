# ALURA_FOOD_RABBITMQ

## Link de documentações e recursos

* [RabbtMQ](https://docs.spring.io/spring-amqp/docs/current/api/)
* [Spring AMQP](https://spring.io/projects/spring-amqp#overview)
* [RabbitMQ simulator](https://tryrabbitmq.com/)

## Passo a passo para a configuração

1. Adicionar a dependência do protocolo AMQP
2. Configurar o arquivo de properties
3. Criar a classe de configuração AMQP

## Configuração default<br></br>

![img.png](img.png)

## Configuração Fanout exchenge<br></br>

* Neste exemplo os microsserviços que são consumidores vão ser responsáveis por criar as filas.
* O microsserviço produtor que criará a exchange

<br></br>
![img_4.png](img_4.png)