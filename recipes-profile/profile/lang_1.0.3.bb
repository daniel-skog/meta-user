DESCRIPTION = "Copy scripts to profile.d"
LICENSE = "CLOSED"
SRC_URI = "file://*"

RDEPENDS_${PN} = "bash"

do_install () {
        install -d ${D}/etc/profile.d
        install -m755 ${WORKDIR}/lang.sh ${D}/etc/profile.d
        install -m755 ${WORKDIR}/keymap.sh ${D}/etc/profile.d
}
