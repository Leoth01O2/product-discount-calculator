<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Discount Calculator</title>
</head>
<body>
    <h2>Product Discount Calculator</h2>
    <form action="display-discount" method="POST">
        <p>
            Product Description:
            <input type="text" name="description" required>
        </p>
        <p>
            List Price:
            <input type="number" name="listPrice" step="any" required>
        </p>
        <p>
            Discount Percent:
            <input type="number" name="discountPercent" step="any" required>
        </p>
        <button type="submit">Calculate Discount</button>
    </form>
</body>
</html>