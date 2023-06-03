<!DOCTYPE html>
<html>
<head>
    <title>Выбор валюты</title>
</head>
<body>
<h2>Выберите валюту:</h2>
<h5>Выберите валюту:</h5>
<form id="currencyForm">
    <select name="currency" id="currencySelect">
        <#list currencies as currency>
            <option value="${currency}">${currency}</option>
        </#list>
    </select>
    <br><br>
    <button type="button" onclick="showGif()">Показать гифку</button>
</form>

<div id="gifContainer"></div>
  <script>
    function showGif() {
    var gifUrl = "${gifUrl}";
    var gifContainer = document.getElementById("gifContainer");
    gifContainer.innerHTML = '<img src="' + gifUrl + '" alt="Гифка">';
}
  </script>

</body>
</html>
