# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING.DOC
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
                    file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949"

SRC_URI = "https://www.nano-editor.org/dist/v5/nano-${PV}.tar.gz"
SRC_URI[md5sum] = "6ee65b221af6834990a6a655df16228a"
SRC_URI[sha1sum] = "dc2eb9387a6dc4a3b997973da8372856651dd5d5"
SRC_URI[sha256sum] = "cb6ac9edc7fb8f723b92a7e5626537e6d546b95abfaddd3f790f65dcdc43a95d"
SRC_URI[sha384sum] = "370b7e162195938ce5d8f22c275f5d4cf8507a906f521357fdb85d93f575bfdb0891d5aa66d6a4631a694117fc19aa3c"
SRC_URI[sha512sum] = "61bf4de300579bc6f0028a2237e105228d8657819c02f32c7ef8f84f9c54734df8fb9a9cddbce0f7721ebc5ac8ae4799c118291ae15480082f8b1317019a485d"

# NOTE: the following library dependencies are unknown, ignoring: curses
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "ncurses zlib file"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit gettext pkgconfig autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""
