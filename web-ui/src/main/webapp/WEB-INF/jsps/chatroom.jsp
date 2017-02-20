<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="zh">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>ShiYanLou Chat</title>
<!-- Set render engine for 360 browser -->
<meta name="renderer" content="webkit">
<!-- No Baidu Siteapp-->
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="alternate icon" href="assets/i/favicon.ico">
<link rel="stylesheet" href="assets/css/amazeui.min.css">
<link rel="stylesheet" href="<%=path%>/assets/css/app.css">
<!-- umeditor css -->
<link rel="stylesheet" href="<%=path%>/umeditor/themes/ueditor.css" >
<style>
.title {
 text-align: center;
}
.chat-content-container {
 height: 29rem;
 overflow-y: scroll;
 border: 1px solid silver;
}
</style>
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
    </script>
</head>
<body>
<div style="height:8rem ;float:left"></div>
<div>
 <!-- title start -->
 <div class="title">
  <div class="am-g am-g-fixed">
   <div class="am-u-sm-12">
    <h1 class="am-text-primary">ShiYanLou Chat</h1>
   </div>
  </div>
 </div>
 <!-- title end -->
 <!-- chat content start -->
 <div class="chat-content">
  <div class="am-g am-g-fixed chat-content-container">
   <div class="am-u-sm-12">
    <ul id="message-list" class="am-comments-list am-comments-list-flip"></ul>
   </div>
  </div>
 </div>
 <!-- chat content start -->
 <!-- message input start -->
 <div class="message-input am-margin-top">
  <div class="am-g am-g-fixed">
   <div class="am-u-sm-12">
    <form class="am-form">
     <div class="am-form-group">
      <script type="text/plain" id="myEditor" style="width: 100%;height: 8rem;"></script>
     </div>
    </form>
   </div>
  </div>
  <div class="am-g am-g-fixed am-margin-top">
   <div class="am-u-sm-6">
    <div id="message-input-nickname" class="am-input-group am-input-group-primary">
     <span class="am-input-group-label"><i class="am-icon-user"></i></span>
     <input id="nickname" type="text" class="am-form-field" placeholder="Please enter nickname"/>
    </div>
   </div>
   <div class="am-u-sm-6">
    <button id="send" type="button" class="am-btn am-btn-primary">
     <i class="am-icon-send"></i> Send
    </button>
   </div>
  </div>
 </div>
 </div>
 <!-- message input end -->
 <!--[if (gte IE 9)|!(IE)]><!-->
 <script src="assets/js/jquery.min.js"></script>
 <!--<![endif]-->
 <!--[if lte IE 8 ]>
 <script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
 <![endif]-->
 <!-- 加载编辑器的容器 -->
 <div style="margin:0 auto;width:1000px;">
    <script id="container" name="content" type="text/plain">
大家好
    </script>
    <!-- 配置文件 -->
    <script type="text/javascript" src="<%=path%>/umeditor/ueditor.config.js"></script>
    <!-- 编辑器源码文件 -->
    <script type="text/javascript" src="<%=path%>/umeditor/ueditor.all.js"></script>
    <!-- 实例化编辑器 -->
    <script type="text/javascript">
        var ue = UE.getEditor('container');
    </script>
    </div>
 </script>
 
 <script>
 function sendMessege() {  
	    var input = $('#container');  
	    var inputValue = input.val();  
	    input.val("");  
	    stompClient.send("/app/userChat", {}, JSON.stringify({  
	        'name': encodeURIComponent(name),  
	        'chatContent': encodeURIComponent(inputValue),  
	        'coordinationId': coordinationId  
	    }));  
	}  
 </script>
 
</body>
</html>