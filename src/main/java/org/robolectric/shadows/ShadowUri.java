package org.robolectric.shadows;

import android.net.Uri;
import org.robolectric.internal.Implements;

@Implements(value = Uri.class, callThroughByDefault = true)
public class ShadowUri {
}
