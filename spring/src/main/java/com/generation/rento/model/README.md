<h1 align="center">🧡 MODEL - SPRING</h1>

## :memo: Descrição
Com objetivo facilitar o processo em aplicações Java. O grupo parte da camada model construindo uma de suas tabelas principais a Categoria.

<br>

## :books: Funcionalidades
* <b>Funcionalidade</b>: classe responsável pela abstração de nossos objetos e tabelas em nossos banco de dados. Com os atributos do descrito no DER da atividade 2 do projeto integrador.

<br>

## :wrench: Tecnologias utilizadas
* ECLIPSE IDE;
* MYSQL;
* SPRING BOOT.

<br>

## :rocket: Apresentando o Código
Para rodar o repositório é necessário clonar o mesmo para que acompanhe outros detalhamentos. Em direção a tasks propostas parte desta camada importante se trata das annotation:
~~~Java
@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	@Size(min = 50, max = 500)
	private String descricao_tomador;

	@NotNull
	@Size(min = 50, max = 500)
	private String descricao_prestador;

	@NotNull
	private double valor;
  
~~~

<br>

## 🚥 ATRIBUTOS E O MOTIVO DAS ESCOLHAS

```
tb_categoria

descricao_tomador: descrição da categoria que será visualizada pelo tomador de serviço.

descricao_prestador: descrição da categoria que será visualizada pelo prestador de serviço.

valor: referente ao serviço a ser prestado.

```

## 🔺 NOSSAS ANOTAÇÕES:

 Tomador: é o conceito formal utilizado para expressar a relação de compra.
<br>

<hr size = "2"</hr>

<br>

## :soon: Implementação futura
* 🚧

<br>

## :handshake: Colaboradores
<table>
  <tr>
    <td align="center">
      <a href="https://github.com/beatriz-rodrig">
        <img src="https://avatars.githubusercontent.com/u/89103950?v=4" width="100px;" alt="Foto de Beatriz Rodrigues no GitHub"/><br>
        <sub>
          <b>beatriz-rodrig</b>
        </sub>
      </a>
    </td>    
    <td align="center">
      <a href="https://github.com/oGraebin">
        <img src="https://avatars.githubusercontent.com/u/84040211?v=4" width="100px;" alt="Foto de Felipe Graebin no GitHub"/><br>
        <sub>
          <b>oGraebin</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/Gus0092">
        <img src="https://avatars.githubusercontent.com/u/88991885?v=4" width="100px;" alt="Foto de Gustavo Victor no GitHub"/><br>
        <sub>
          <b>Gus0092</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="http://github.com/r4skaren">
        <img src="https://avatars.githubusercontent.com/u/86742652?v=4" width="100px;" alt="Foto de Karen Rodrigues no GitHub"/><br>
        <sub>
          <b>r4skaren</b>
        </sub>
      </a>
    </td>
        <td align="center">
      <a href="https://github.com/byTiagoAssis">
        <img src="https://avatars.githubusercontent.com/u/86063887?v=4" width="100px;" alt="Foto de Tiago Assis no GitHub"/><br>
        <sub>
          <b>byTiagoAssis</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

<br>

## :dart: Status do projeto
EM ANDAMENTO 🔄
