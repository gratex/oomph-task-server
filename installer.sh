#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

if [[ ! -d $HOME/opt/eclipse/installer ]]; then
    mkdir -p "$HOME/opt/eclipse/installer"
    wget -O "$HOME/opt/eclipse/installer/installer.tar.gz" "https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2022-09/R/eclipse-inst-jre-linux64.tar.gz"
    cd "$HOME/opt/eclipse/installer"
    tar xf installer.tar.gz
fi

"$HOME/opt/eclipse/installer/eclipse-installer/eclipse-inst" -Doomph.redirection.setups="index:/->file://$DIR/index/" \

