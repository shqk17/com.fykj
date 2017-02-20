<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>  
<head>  
<meta charset="UTF-8">
    <title>登陆</title>  

    <script type="text/javascript" src="<%=path%>/easyui/js/jquery.min.js"></script>
    <script type="text/javascript" src="<%=path%>/easyui/js/jquery.easyui.min.js"></script>
    <script src="http://cdn.sockjs.org/sockjs-0.3.min.js"></script>  
  
    <script type="text/javascript">  
    var ws = null;  
    var url = null;  
    var transports = [];  

    function setConnected(connected) {  
        document.getElementById('connect').disabled = connected;  
        document.getElementById('disconnect').disabled = !connected;  
        document.getElementById('echo').disabled = !connected;  
    }  
  
    function connect() {  
        alert("url:"+url);
        console.log("url:"+url);
        if (!url) {  
            alert('Select whether to use W3C WebSocket or SockJS');  
            return;  
        }  

        ws = (url.indexOf('sockjs') != -1) ?   
            new SockJS(url, undefined, {protocols_whitelist: transports}) : new WebSocket(url);  

        ws.onopen = function () {  
            setConnected(true);  
            log('Info: connection opened.');  
        };  
        ws.onmessage = function (event) {  
            log('Received: ' + event.data);  
        };  
        ws.onclose = function (event) {  
            setConnected(false);  
            log('Info: connection closed.');  
            log(event);  
        };  
    }   
  
    function disconnect() {  
        if (ws != null) {  
            ws.close();  
            ws = null;  
        }  
        setConnected(false);  
    }  

    function echo() {  
        if (ws != null) {  
            var message = document.getElementById('message').value;  
            log('Sent: ' + message);  
            ws.send(message);  
        } else {  
            alert('connection not established, please connect.');  
        }  
    }  

    function updateUrl(urlPath) {  
        if (urlPath.indexOf('sockjs') != -1) {  
            url = urlPath;  
            document.getElementById('sockJsTransportSelect').style.visibility = 'visible';  
        }  
        else {  
          if (window.location.protocol == 'http:') {  
              url = 'ws://' + window.location.host + urlPath;  
          } else {  
              url = 'wss://' + window.location.host + urlPath;  
          }  
          document.getElementById('sockJsTransportSelect').style.visibility = 'hidden';  
        }  
    }  

    function updateTransport(transport) {  
        alert(transport);  
      transports = (transport == 'all') ?  [] : [transport];  
    }  
      
    function log(message) {  
        var console = document.getElementById('console');  
        var p = document.createElement('p');  
        p.style.wordWrap = 'break-word';  
        p.appendChild(document.createTextNode(message));  
        console.appendChild(p);  
        while (console.childNodes.length > 25) {  
            console.removeChild(console.firstChild);  
        }  
        console.scrollTop = console.scrollHeight;  
    }   
        function check() { //验证用户名是否为空
        	username= document.form1.username.value; 
        	password = document.form1.password.value; 
        	if (username == ""||password == "") 
        	{ 
        	alert("请填写用户名密码"); 
        	 
        	return false; 
        	} else if(username!="qwe"){
        		alert("用户名不正确");
        		return false; 
        		
        	}else{

        		alert("okjhgj12");
        		//window.location.href="http://localhost:8080/action-wanjia-ui/helloSocket2";
        		$("#connect").click();
        		alert("ok");
        		return false;
        			
        	}
        }  
        	 
    </script>  
</head>  
<body>  
<noscript><h2 style="color: #ff0000">Seems your browser doesn't support Javascript! Websockets   
    rely on Javascript being enabled. Please enable  
    Javascript and reload this page!</h2></noscript>  
<div>  
<div >
<form name="form1" method="post" > 
用户名<input name="username" type="text" > 
密码<input name="password" type="text" > 
<div>
<input type="submit" name="Submit" value="登陆" onClick="return check()"> 
<input type="reset" name="Submit2" value="重填"> 
</div>
</form> 
</div>


<div id="connect-container">  
        <input id="radio1" type="radio" name="group1" onclick="updateUrl('/action-wanjia-ui/java/websocket/websocket');">  
            <label for="radio1">W3C WebSocket</label>  
        <br>  
        <input id="radio2" type="radio" name="group1" onclick="updateUrl('/action-wanjia-ui/java/websocket/websocket');">  
            <label for="radio2">SockJS</label>  
        <div id="sockJsTransportSelect" style="visibility:hidden;">  
            <span>SockJS transport:</span>  
            <select onchange="updateTransport(this.value)">  
              <option value="all">all</option>  
              <option value="websocket">websocket</option>  
              <option value="xhr-polling">xhr-polling</option>  
              <option value="jsonp-polling">jsonp-polling</option>  
              <option value="xhr-streaming">xhr-streaming</option>  
              <option value="iframe-eventsource">iframe-eventsource</option>  
              <option value="iframe-htmlfile">iframe-htmlfile</option>  
            </select>  
        </div>  
        <div>  
            <button id="connect" onclick="connect();">Connect</button>  
            <button id="disconnect" disabled="disabled" onclick="disconnect();">Disconnect</button>  
        </div>  
        <div>  
            <textarea id="message" style="width: 350px">Here is a message!</textarea>  
        </div>  
        <div>  
            <button id="echo" onclick="echo();" disabled="disabled">Echo message</button>  
        </div>  
    </div>  
    <div id="console-container">  
        <div id="console"></div>  
    </div>  
</div>  
</body>  
</html>  