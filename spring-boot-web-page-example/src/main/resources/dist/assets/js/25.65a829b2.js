(window.webpackJsonp=window.webpackJsonp||[]).push([[25],{526:function(e,s,t){"use strict";t.r(s);var r=t(30),a=Object(r.a)({},(function(){var e=this,s=e.$createElement,t=e._self._c||s;return t("ContentSlotsDistributor",{attrs:{"slot-key":e.$parent.slotKey}},[t("h2",{attrs:{id:"安装"}},[t("a",{staticClass:"header-anchor",attrs:{href:"#安装"}},[e._v("#")]),e._v(" 安装")]),e._v(" "),t("div",{staticClass:"custom-block tip"},[t("p",{staticClass:"custom-block-title"},[e._v("提示")]),e._v(" "),t("p",[e._v("如果是个人的开发环境下，推荐使用Docker Desktop，方便又快捷")])]),e._v(" "),t("h3",{attrs:{id:"使用docker-desktop-安装"}},[t("a",{staticClass:"header-anchor",attrs:{href:"#使用docker-desktop-安装"}},[e._v("#")]),e._v(" 使用Docker Desktop 安装")]),e._v(" "),t("p",[e._v("Docker 官网提供桌面安装程序 "),t("a",{attrs:{href:"https://docs.docker.com/get-docker/",target:"_blank",rel:"noopener noreferrer"}},[e._v("Docker Desktop"),t("OutboundLink")],1),e._v("，可以根据自己的操作系统选择，Docker Desktop 包含了Docker所有相关组件，方便快捷，但是要注意的是Docker Desktop 的"),t("a",{attrs:{href:"https://docs.docker.com/get-started/",target:"_blank",rel:"noopener noreferrer"}},[e._v("条款"),t("OutboundLink")],1),e._v("。")]),e._v(" "),t("h3",{attrs:{id:"使用脚本安装"}},[t("a",{staticClass:"header-anchor",attrs:{href:"#使用脚本安装"}},[e._v("#")]),e._v(" 使用脚本安装")]),e._v(" "),t("p",[e._v("如果是Linux Server的这类纯命令行系统，Docker 也针对此做了便携式的安装脚本，脚本如下（注意，有些操作系统如果不被支持，可前往官网查看"),t("a",{attrs:{href:"https://docs.docker.com/engine/install/#server",target:"_blank",rel:"noopener noreferrer"}},[e._v("相关文档"),t("OutboundLink")],1),e._v("）：")]),e._v(" "),t("div",{staticClass:"language-shell extra-class"},[t("pre",{pre:!0,attrs:{class:"language-shell"}},[t("code",[t("span",{pre:!0,attrs:{class:"token function"}},[e._v("curl")]),e._v(" -fsSL https://get.docker.com -o get-docker.sh "),t("span",{pre:!0,attrs:{class:"token operator"}},[e._v("&&")]),e._v(" "),t("span",{pre:!0,attrs:{class:"token function"}},[e._v("sudo")]),e._v(" "),t("span",{pre:!0,attrs:{class:"token function"}},[e._v("sh")]),e._v(" get-docker.sh "),t("span",{pre:!0,attrs:{class:"token operator"}},[e._v("&&")]),e._v(" systemctl start "),t("span",{pre:!0,attrs:{class:"token function"}},[e._v("docker")]),e._v("\n")])])]),t("p",[e._v("上面脚本安装了基本的docker基本组件，如果有docker-compose使用需求的人，按照以下脚本执行即可，下的脚本是基于docker-compose 2.6.1 版本，如果需要特定版本可前往Github下载：https://github.com/docker/compose/releases，然后自行拆分脚本运行")]),e._v(" "),t("div",{staticClass:"language-shell extra-class"},[t("pre",{pre:!0,attrs:{class:"language-shell"}},[t("code",[t("span",{pre:!0,attrs:{class:"token function"}},[e._v("wget")]),e._v(" https://vkceyugu.cdn.bspapp.com/VKCEYUGU-21c55d63-eb93-4973-a1cf-68ec2beeb86c/d009bd85-9e54-4aca-a814-163be7a3a83e. -O /usr/local/bin/docker-compose "),t("span",{pre:!0,attrs:{class:"token operator"}},[e._v("&&")]),e._v(" "),t("span",{pre:!0,attrs:{class:"token function"}},[e._v("sudo")]),e._v(" "),t("span",{pre:!0,attrs:{class:"token function"}},[e._v("chmod")]),e._v(" +x /usr/local/bin/docker-compose "),t("span",{pre:!0,attrs:{class:"token operator"}},[e._v("&&")]),e._v(" "),t("span",{pre:!0,attrs:{class:"token function"}},[e._v("sudo")]),e._v(" "),t("span",{pre:!0,attrs:{class:"token function"}},[e._v("ln")]),e._v(" -s /usr/local/bin/docker-compose /usr/bin/docker-compose "),t("span",{pre:!0,attrs:{class:"token operator"}},[e._v("&&")]),e._v(" "),t("span",{pre:!0,attrs:{class:"token function"}},[e._v("docker-compose")]),e._v(" --version\n")])])]),t("h2",{attrs:{id:"镜像加速"}},[t("a",{staticClass:"header-anchor",attrs:{href:"#镜像加速"}},[e._v("#")]),e._v(" 镜像加速")]),e._v(" "),t("p",[e._v("如果遇到由于拉取镜像的时间异常的长的话，可以配置镜像加速，可以参考和使用"),t("a",{attrs:{href:"https://cr.console.aliyun.com/cn-hangzhou/instances/mirrors",target:"_blank",rel:"noopener noreferrer"}},[e._v("阿里云"),t("OutboundLink")],1),e._v("提供的镜像加速服务。")]),e._v(" "),t("h2",{attrs:{id:"hello-world"}},[t("a",{staticClass:"header-anchor",attrs:{href:"#hello-world"}},[e._v("#")]),e._v(" Hello World")]),e._v(" "),t("div",{staticClass:"language-shell extra-class"},[t("pre",{pre:!0,attrs:{class:"language-shell"}},[t("code",[t("span",{pre:!0,attrs:{class:"token function"}},[e._v("docker")]),e._v(" run ubuntu:22.04 /bin/echo "),t("span",{pre:!0,attrs:{class:"token string"}},[e._v('"Hello world"')]),e._v("\n")])])]),t("p",[t("img",{attrs:{src:"https://oss.docss.cc/docker/example/docker-hello-world.png",alt:"img"}})])])}),[],!1,null,null,null);s.default=a.exports}}]);