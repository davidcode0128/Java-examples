<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%--
JSP 的 EL ( Expression Language ) 用法 : 讀取 Model  資料
https://openhome.cc/Gossip/ServletJSP/ELProperty.html
--%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Customer Information</h1>
        <p>客戶名稱：${customer.name}</p>
        <p>公司地址:<br/>
        ${customer.officeAddress.address1}<br/>
        ${customer.officeAddress.address2}<br/>
        ${customer.officeAddress.city}<br/>
        ${customer.officeAddress.region}<br/>
        ${customer.officeAddress.postcode}<br/>
        </p>
        <p>帳單地址：<br/>
        ${customer.billingAddress.address1}<br/>
        ${customer.billingAddress.address2}<br/>
        ${customer.billingAddress.city}<br/>
        ${customer.billingAddress.region}<br/>
        ${customer.billingAddress.postcode}<br/>
        </p>
        <p>送貨地址：<br/>
        ${customer.deliveryAddress.address1}<br/>
        ${customer.deliveryAddress.address2}<br/>
        ${customer.deliveryAddress.city}<br/>
        ${customer.deliveryAddress.region}<br/>
        ${customer.deliveryAddress.postcode}<br/>    
        </p>
        <%--用 EL 讀取陣列 --%>
        <p>透過 index 讀取 Array<br/>
        ${customer.addresses[2].address1}<br/>
        ${customer.addresses[2].address2}<br/>
        ${customer.addresses[2].city}<br/>
        ${customer.addresses[2].region}<br/>
        ${customer.addresses[2].postcode}<br/>        
        </p>
        <%--用 EL 讀取 Map --%>
        <p>透過 EL 讀取 Map 整數預設採用 Long 長整數<br/>
        ${customers[1].name}<br/>
        ${customers[1].officeAddress.address1}<br/>
        ${customers[1].addresses[2].address1}<br/>        
        </p>
    </body>
</html>
