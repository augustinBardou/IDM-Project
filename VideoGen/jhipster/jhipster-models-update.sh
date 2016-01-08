#!/bin/sh
#---------------------------------------------
#   jhipster-models-update
#
#   Utility script to Update Jhipster's models after beign copied inside the .jhipster models folder
#
#   Refer to the usage() function below for usage.
#
#   Copyright 2016, Stephane <stephane.mangin@freesbee.fr>
#
#   LICENSE:
#
#   Permission is hereby granted, free of charge, to any person obtaining a
#   copy of this software and associated documentation files (the "Software"),
#   to deal in the Software without restriction, including without limitation
#   the rights to use, copy, modify, merge, publish, distribute, sublicense,
#   and/or sell copies of the Software, and to permit persons to whom the
#   Software is furnished to do so, subject to the following conditions:
#
#   The above copyright notice and this permission notice shall be included
#   in all copies or substantial portions of the Software.
#
#   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
#   OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
#   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
#   THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR
#   OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
#   ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
#   OTHER DEALINGS IN THE SOFTWARE.
#
#---------------------------------------------

jhipsterFolder=".jhipster"

usage()
{
cat << EOT
Name

jhipster-models-update - Update Jhipster's models after beign copied inside the .jhipster models folder

Synopsis

jhipster-models-update [options]

jhipster-models-update { --help | --version }

Options:

-p <dir>,		: Path to your Jhipster folder.
--path <dir>
-f, --force		: Force the complete regeneration of CRUD and DTO classes (if any). Use at your own risk if they have been customized !
--help			: Show command synopsis.
--version		: Show the xdg-utils version information.

Examples

jhipster-models-update -f -p ../../MyJhipsterProject

EOT
}

force=
path=
while [ $# -gt 0 ]; do
    parm="$1"
    shift

    case "$parm" in
      -p|--path)
      	if [ -z "$1" ] ; then
            echo "ERROR: path argument missing for -p"
            exit 1
        fi
        path="$1"
    	shift
        ;;
      -f|--force)
        force=" --force"
        shift
        ;;
      -*)
        echo "ERROR: unexpected option '$parm'"
        exit 1
        ;;
      *)
        echo "ERROR:  missing option -p"
        exit 1
        ;;
    esac
done


if [ ! -z $path ]; then
    echo "Entering: $path" 
    cd $path && pwd
fi
if [ ! -d ".jhipster" ] ; then
    echo "ERROR: .jhipster folder not found"
    exit 1
fi

echo "Models found: `ls -x .jhipster/`"

for f in `ls $jhipsterFolder`; do
	echo "-------------------------------------------------"
	echo "yo jhipster:entity "${f%.json}" $force"
	echo "-------------------------------------------------"
	yo jhipster:entity ${f%.json} $force;
done

exit 0