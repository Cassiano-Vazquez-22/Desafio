<!DOCTYPE html>
<html lang="pt-BR">
<head>
  <meta charset="UTF-8">
  <title>TechStart - Avaliação de Estagiários</title>
  <style>
    body { font-family: sans-serif; max-width: 450px; margin: 40px auto; padding: 20px; border: 1px solid #ddd; border-radius: 8px; }
    input, button { width: 100%; padding: 8px; margin: 8px 0; box-sizing: border-box; }
    button { background: #0070f3; color: white; border: none; border-radius: 4px; font-weight: bold; cursor: pointer; }
    .resultado { margin-top: 15px; padding: 10px; background: #f0f0f0; border-radius: 4px; }
  </style>
</head>
<body>
  <h2>TechStart - Cálculo de Médias</h2>
  <label>Nota 1: <input type="number" step="0.1" id="n1"></label>
  <label>Nota 2: <input type="number" step="0.1" id="n2"></label>
  <label>Nota 3: <input type="number" step="0.1" id="n3"></label>
  <label>Nota 4: <input type="number" step="0.1" id="n4"></label>
  <button onclick="calcular()">Calcular Média</button>

  <div class="resultado" id="res" style="display:none;"></div>

  <script>
    function calcular() {
      // 1. Entrada
      const nota1 = parseFloat(document.getElementById('n1').value);
      const nota2 = parseFloat(document.getElementById('n2').value);
      const nota3 = parseFloat(document.getElementById('n3').value);
      const nota4 = parseFloat(document.getElementById('n4').value);

      // 2. Processamento Sequencial (sem if/else)
      const media = (nota1 + nota2 + nota3 + nota4) / 4;
      const aprovado = media >= 7.0;

      // 3. Saída
      const res = document.getElementById('res');
      res.style.display = 'block';
      res.innerHTML = `<strong>Média Final:</strong> ${media.toFixed(2)}<br>
                       <strong>Aprovado:</strong> ${aprovado}`;
    }
  </script>
</body>
</html>
