<!DOCTYPE html>
<html>
<head>
    <title>Bags US/EU</title>
</head>
<body>
<h1>Bags US/EU - Michael Kors</h1><hr>
<h4>Detailed information about product</h4>
<#list images as img>
    <img src="/images/${img.id}" height="60px"/><br><br>
</#list>
<b>Name of a product: </b>${product.title}<br>
<b>Description of a product: </b>${product.description}<br>
<b>Price: </b>${product.price}<br>
<b>City: </b>${product.city}<br>
<b>Author: </b>${product.author}<br>
<hr>

<form action="/product/delete/${product.id}" method="post">
    <input type="submit" value="Delete a product">
</form>
</body>
</html>