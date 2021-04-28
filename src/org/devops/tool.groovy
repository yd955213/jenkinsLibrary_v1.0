package org.devops

def printMsg(contains,color){
    colors = ['red'   : "\033[40;31m >>>>>>>>>>>${contains}<<<<<<<<<<< \033[0m",
              'blue'  : "\033[47;34m ${contains} \033[0m",
              'green' : "[1;32m>>>>>>>>>>${contains}>>>>>>>>>>[m",
              'green1' : "\033[40;32m >>>>>>>>>>>${contains}<<<<<<<<<<< \033[0m" ]
    ansiColor('xterm') {
        println(colors[color])
    }
}
