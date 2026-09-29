# Padrão Bridge — Controle Remoto

Este projeto demonstra o padrão de projeto **Bridge** usando um exemplo simples do cotidiano: controles remotos e aparelhos eletrônicos.

O exemplo separa duas partes que podem variar de forma independente:

- **Controles:** controle comum e controle avançado;
- **Aparelhos:** televisão e rádio.

Qualquer controle pode operar qualquer aparelho. Assim, não é necessário criar classes como `ControleComumDaTelevisao`, `ControleAvancadoDaTelevisao`, `ControleComumDoRadio` e outras combinações.

## Estrutura do padrão

- `ControleRemoto`: controle remoto comum;
- `ControleRemotoAvancado`: controle com a função adicional de silenciar;
- `Aparelho`: contrato dos aparelhos que podem ser controlados;
- `Televisao` e `Radio`: aparelhos concretos.

## Relacionamentos entre as classes

```text
ControleRemoto ───────────────> Aparelho
      △                            △
      │                            │
ControleRemotoAvancado       ┌─────┴─────┐
                             │           │
                        Televisao      Radio
```

- `ControleRemotoAvancado` herda de `ControleRemoto`;
- `ControleRemoto` possui uma referência para `Aparelho`;
- `Televisao` e `Radio` implementam `Aparelho`.

## Executando o projeto

```bash
mvn compile exec:java -Dexec.mainClass=org.example.Principal
```

## Executando os testes

```bash
mvn test
```
