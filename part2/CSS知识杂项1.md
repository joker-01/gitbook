# 代码知识点收录

<section> 标签

## border

border属性是一个用于设置各种单独的边界属性的简写属性。border可以用于设置一个或多个以下属性的值： border-width, border-style, border-color。
虽然border-width,、border-style和 border-color 简写属性接受最多4个参数来为不同的边设置宽度、风格和颜色，但boder属性只接受三个参数，分别是宽度、风格和颜色，所以这样会使得四条边的边框相同。

###  border-width 
 border-width  属性可以设置盒子模型的边框宽度。  
 https://developer.mozilla.org/zh-CN/docs/Web/CSS/border-width  

### border-style
用来设定元素所有边框的样式。  
https://developer.mozilla.org/zh-CN/docs/Web/CSS/border-style

### border-color
是一个用于设置元素四个边框颜色的快捷属性


### border-bottom  border-top border-left border-right  
border-bottom 简写属性把下边框的所有属性：  
border-bottom-color，border-bottom-style 与 border-bottom-width 设置到了一个声明中。这些属性描述了元素的下边框样式。  
  
## font  
font 属性可以用来作为 font-style, font-variant, font-weight, font-size, line-height 和 font-family 属性的简写，或将元素的字体设置为系统字体。
### font-weight  
属性指定了字体的粗细程度。 一些字体只提供 normal 和 bold 两种值。  
https://developer.mozilla.org/zh-CN/docs/Web/CSS/font-weight    

### font-size
 属性指定字体的大小。因为该属性的值会被用于计算em和ex长度单位，定义该值可能改变其他元素的大小  
 
## box-sizing
box-sizing: content-box|border-box|inherit;

值   描述  
content-box	
这是由 CSS2.1 规定的宽度高度行为。
宽度和高度分别应用到元素的内容框。
在宽度和高度之外绘制元素的内边距和边框。

border-box	
为元素设定的宽度和高度决定了元素的边框盒。
就是说，为元素指定的任何内边距和边框都将在已设定的宽度和高度内进行绘制。
通过从已设定的宽度和高度分别减去边框和内边距才能得到内容的宽度和高度。

inherit	规定应从父元素继承 box-sizing 属性的值。

！！！！！！！！border-box不包含margin

## display  
https://zh.learnlayout.com/display.html
https://developer.mozilla.org/en-US/docs/Web/CSS/display

实现 流式 、网格 、 浮动式布局  
每个元素都有一个默认的 display 值，这与元素的类型有关。对于大多数元素它们的默认值通常是 block 或 inline 。一个 block 元素通常被叫做块级元素。一个 inline 元素通常被叫做行内元素。  
一个块级元素会新开始一行并且尽可能撑满容器。  


display:none 通常被 JavaScript 用来在不删除元素的情况下隐藏或显示元素。

CSSdisplay属性使用关键字值指定。 分为6大类，详细见上链接
/* legacy values */  
display: block;  
display: inline;  
display: inline-block;  
display: flex;  
display: inline-flex;  
display: grid;  
display: inline-grid;  
display: flow-root;  
/* box generation */  
display: none;  
display: contents;  
/* two-value syntax */  
display: block flow;  
display: inline flow;  
display: inline flow-root;  
display: block flex;  
display: inline flex;  
display: block grid;  
display: inline grid;  
display: block flow-root;  
/* other values */  
display: table;  
display: table-row; /* all table elements have an equivalent CSS display value */  
display: list-item;  
/* Global values */  
display: inherit;  
display: initial;  
display: unset;  

设置块级元素的 width 



## position
CSS position属性用于指定一个元素在文档中的定位方式。

position 属性被指定为从下面的值列表中选择的单个关键字。

取值
static
该关键字指定元素使用正常的布局行为，即元素在文档常规流中当前的布局位置。此时 top, right, bottom, left 和 z-index 属性无效。
relative
该关键字下，元素先放置在未添加定位时的位置，再在不改变页面布局的前提下调整元素位置（因此会在此元素未添加定位时所在位置留下空白）。position:relative 对 table-*-group, table-row, table-column, table-cell, table-caption 元素无效。
absolute
元素会被移出正常文档流，并不为元素预留空间，通过指定元素相对于最近的非 static 定位祖先元素的偏移，来确定元素位置。绝对定位的元素可以设置外边距（margins），且不会与其他边距合并。
fixed
元素会被移出正常文档流，并不为元素预留空间，而是通过指定元素相对于屏幕视口（viewport）的位置来指定元素位置。元素的位置在屏幕滚动时不会改变。打印时，元素会出现在的每页的固定位置。fixed 属性会创建新的层叠上下文。当元素祖先的 transform, perspective 或 filter 属性非 none 时，容器由视口改为该祖先。
sticky
元素根据正常文档流进行定位，然后相对它的最近滚动祖先（nearest scrolling ancestor）和 containing block (最近块级祖先 nearest block-level ancestor)，包括table-related元素，基于top, right, bottom, 和 left的值进行偏移。偏移值不会影响任何其他元素的位置。
该值总是创建一个新的层叠上下文（stacking context）。注意，一个sticky元素会“固定”在离它最近的一个拥有“滚动机制”的祖先上（当该祖先的overflow 是 hidden, scroll, auto, 或 overlay时），即便这个祖先不是最近的真实可滚动祖先。这有效地抑制了任何“sticky”行为（详情见Github issue on W3C CSSWG）

任意 position: static; 的元素不会被特殊的定位。一个 static 元素表示它不会被“positioned”，一个 position 属性被设置为其他值的元素表示它会被“positioned”。

## float

另一个布局中常用的CSS属性是 float 。Float 可用于实现文字环绕图片
float ：left；
clear: left; 清除浮动

## overflow

溢流定义当一个元素的内容太大而无法适应块级格式化上下文时候该做什么

值
visible
默认值.内容不会被修剪，可以呈现在元素框之外.
hidden
如果需要，内容将被剪裁以适合填充框.不提供滚动条.
scroll
如果需要，内容将被剪裁以适合填充框.浏览器显示滚动条，无论是否实际剪切了任何内容.(这可以防止滚动条在内容更改时出现或消失.))打印机仍可能打印溢出的内容.
auto
取决于用户代理.如果内容适合填充框内部，则它看起来与可见内容相同，但仍会建立新的块格式化上下文.如果内容溢出，桌面浏览器会提供滚动条.
overlay  
行为与auto相同，但滚动条绘制在内容之上而不是占用空间.仅在基于WebKit(例如，Safari)和基于Blink的(例如，Chrome或Opera)浏览器中受支持。


## 响应式设计@media

## flex布局
http://weblog.bocoup.com/dive-into-flexbox/

## justify-content 
用于设置或检索弹性盒子元素在主轴（横轴）方向上的对齐方式。

flex-start	默认值。项目位于容器的开头。  
flex-end	项目位于容器的结尾。  
center	项目位于容器的中心。  
space-between	项目位于各行之间留有空白的容器内。	  
space-around	项目位于各行之前、之间、之后都留有空白的容器内。	  
initial	设置该属性为它的默认值。请参阅 initial。  
inherit	从父元素继承该属性。请参阅 inherit。
