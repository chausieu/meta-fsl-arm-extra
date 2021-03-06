# Copyright (C) 2015 Gateworks Corporation
# Released under the MIT license (see COPYING.MIT for the terms)

include recipes-kernel/linux/linux-imx.inc
include recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCREV = "3ef4cbf4f20ce06b58def2c7db2a3091b5a8ca2f"
LOCALVERSION = "-1.0.x_ga+yocto"
SRC_URI = "git://github.com/Gateworks/linux-imx6.git;protocol=git;branch=gateworks_fslc_3.14_1.0.x_ga \
           file://defconfig"

COMPATIBLE_MACHINE = "(ventana)"
