package org.devops


def printMsg(contains,color){
    colors = ['red'   : "\033[41;37m >>>>>>>>>>>>>>>>>>>>>>	${contains}	<<<<<<<<<<<<<<<<<<<<<< \033[0m",
              'blue'  : "\033[47;34m >>>>>>>>>>>>>>>>>>>>>>	${contains}	<<<<<<<<<<<<<<<<<<<<<< \033[0m",
              'green' : "[1;32m >>>>>>>>>>>>>>>>>>>>>>	${contains}	<<<<<<<<<<<<<<<<<<<<<< [m",
              'green1' : "\033[47;32m >>>>>>>>>>>>>>>>>>>>>>	${contains}	<<<<<<<<<<<<<<<<<<<<<< \033[0m" ]
    ansiColor('xterm') {
        println(colors[color])
    }
}