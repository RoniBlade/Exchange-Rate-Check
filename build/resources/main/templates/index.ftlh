<!DOCTYPE html>
<html>
<head>
    <title>Выбор валюты</title>
</head>
<body>
<h2>Выберите валюту:</h2>
<button type="button" onclick="showGif()">Показать гифку</button>
<div id="gifContainer"></div>
  <script>
    function showGif() {
    var gifUrl = "" + "${gifUrl}";
    var gifContainer = document.getElementById("gifContainer");
    gifContainer.innerHTML = '<iframe src="' + gifUrl + '" width="480" height="270" frameBorder="0" class="giphy-embed" allowFullScreen></iframe>';
   }
  </script>

</body>
</html>
