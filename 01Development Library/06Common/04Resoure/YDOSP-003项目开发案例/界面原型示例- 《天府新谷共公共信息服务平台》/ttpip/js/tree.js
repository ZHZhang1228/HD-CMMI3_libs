var Prealink=-1,Pcollapse=0;
var iconblank="images/01.gif";
var iconcollapse="images/03.gif";
var iconexpand="images/02.gif";
var iconaccout="images/01.gif";
var iconfolder="images/03.gif";
var iconfolderopen="images/02.gif";
//-------------------- 左侧目录树js部分 ---------------
function TreeExpand(eimg) {//--树的展开-与收起+
if (eimg.alt=="+") {
	eimg.alt="-";
	eimg.src=iconexpand;
	eimg.parentNode.parentNode.getElementsByTagName("span")[0].style.display="block";
	}
else {
	eimg.alt="+";
	eimg.src=iconcollapse;
	eimg.parentNode.parentNode.getElementsByTagName("span")[0].style.display="none";
	var Curalink=eimg.parentNode.getElementsByTagName("a")[0]
	if (Prealink == -1 || Prealink == Curalink)		{return;}
	var parentTree,CurTree;//--以下,折叠位置是原聚焦节点的父节点，则触发父节点的点击
	parentTree=Prealink.parentNode.parentNode;
	CurTree=eimg.parentNode.parentNode;
	while(parentTree.className == "ChildTree" || parentTree.className == "RootTree"){
		if(CurTree == parentTree){
			Pcollapse=1;
			imgFolder(eimg);
			break;}
		parentTree=parentTree.parentNode.parentNode;		
		}	
	}//endelse
}
function imgFolder(fimg) {//--目录的点击 即是触发链接A
var alink=fimg.parentNode.getElementsByTagName("a")[0]
alink.focus();
//open (alink.href, alink.target ?alink.target : '_blank');   //--模拟a.click()方法以兼容firefox
if(alink.name == "accountlink")		aFolder(alink,0);
else	aFolder(alink,1);
}
function aFolder(fa,i) {//--链接的点击-目录打开及展开子树 根i=0 子i=1
var expandimg=fa.parentNode.getElementsByTagName("img")[0];
//--前节点目录图标关闭
if(Prealink != -1 && Prealink.name != "accountlink")	
	{Prealink.parentNode.getElementsByTagName("img")[1].src=iconfolder;}
//--当前节点目录图标打开;根i=0，子i=1
if(i) 
	{fa.parentNode.getElementsByTagName("img")[1].src=iconfolderopen;}
//--目录树的展开
if(Pcollapse==0 && expandimg.alt=="+"){
	var expandimg=fa.parentNode.getElementsByTagName("img")[0];
	expandimg.alt="-";
	expandimg.src=iconexpand;
	fa.parentNode.parentNode.getElementsByTagName("span")[0].style.display="block";
	}
else	{Pcollapse=0;}
Prealink=fa;
}