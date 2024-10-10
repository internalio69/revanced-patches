package app.revanced.patches.googlephotos.features

import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.all.misc.build.BaseSpoofBuildInfoPatch

@Patch(description = "Spoof build info to Google Pixel 1.")
internal class SpoofBuildInfoPatch : BaseSpoofBuildInfoPatch() {
    override val brand = "google"
    override val manufacturer = "Google"
    override val device = "sailfish"
    override val product = "sailfish"
    override val model = "Pixel"
    override val fingerprint = "google/sailfish/sailfish:10/QP1A.191005.007.A3/5972272:user/release-keys"
}
