# 将CsDN的博客保存为PDF

#### Question的来源
*经常需要解决一些问题，CSDN可以提供比较好的答案，但是不能保存，可以采取打印的方式来存储为PDF，一方面可以离线查看，另一方面可以构建自己的资料库*

## 思路

> 采取操作DOM数的方式，将Blog中无关的信息删除，然后打印出来

## 过程

1.确认干扰项
> body div.id='csdn-toolbar'   //标题头  
> body div.class='main_father' div.id='mainBox'   
>> aside //边栏  
>> main div.class='blog-content-box'  //我们需要的内容  
>> main div.id='toolBarBox'  //文章点赞评论工具栏
>> main div.class='recommend-box first-recommend-box' //相关文章,会有多个，用循环列表解决
>> main div.class="comment-box" // 评论input
>> main div.class="recommend-box insert-baidu-box" //其他文章
>


## Code

```
 //1.删除标题头
 var header = document.getElementById("csdn-toolbar");
 var headerFather = header.parentNode;
 headerFather.removeChild(header);
 //2.删除边栏
 var aside = document.querySelector("aside");
 var asideFather = aside.parentNode;
 asideFather.removeChild(aside);
 //3.删除文章点赞评论工具栏
 var toolBarBox = document.getElementById("toolBarBox");
 var toolBarBoxFather = toolBarBox.parentNode;
 toolBarBoxFather.removeChild(toolBarBox);
 //4.相关文章  其他文章
 var reCommonds = document.getElementsByClassName("recommend-box");
 for(var i=0;i<=reCommonds.length;i++){
     console.log(i)
     var reCommond = reCommonds[0];//注意Dom树是动态的，所有才会是【0】
     var reCommondFather = reCommond.parentNode;
     reCommondFather.removeChild(reCommond);
 }
 reCommonds[0].parentNode.removeChild(reCommonds[0]);//???为啥要加这一行
 //5.删除评论input 
 var inputs = document.getElementsByClassName("comment-box");
 inputs[0].parentNode.removeChild(inputs[0]);
 //6.打印
 window.print();
```

Tips：建议学习一下JS里关于Dom树的操作

# 简单的保存百度文库内容的Js代码，后期需要手工Nodepad++修剪一下
```
arrow = document.getElementsByTagName("p");
for(i=0;i<=arrow.length-1;i++){
  console.log(arrow[i].innerText)
}
```
```
while(i<document.getElementsByTagName("p").length){
    i++;console.log(document.getElementsByTagName("p")[i].innerText)
}
```

# 禁止代码片段复制的代码
删除之
```
<script type="application/ld+json">{"@context":"https://ziyuan.baidu.com/contexts/cambrian.jsonld","@id":"https://blog.csdn.net/lose_synchronization/article/details/113437305","appid":"1638831770136827","pubDate":"2021-01-30T16:07:43","title":"Java打印任意字符串的字符画_lose_synchronization的博客-CSDN博客","upDate":"2021-01-30T16:07:43"}</script>
```
+ 主要是下面的代码在起作用
```
<style>
        #content_views pre{
            -webkit-touch-callout: none;
            -webkit-user-select: none;
            -khtml-user-select: none;
            -moz-user-select: none;
            -ms-user-select: none; 
            user-select: none; 
        }
        #content_views pre code{
            -webkit-touch-callout: none;
            -webkit-user-select: none;
            -khtml-user-select: none;
            -moz-user-select: none;
            -ms-user-select: none; 
            user-select: none; 
        }
    </style>
```