// (C) 2011 Uri Wilensky. https://github.com/NetLogo/NetLogo

package org.nlogo.prim.etc

import org.nlogo.api.Syntax
import org.nlogo.nvm.{ Command, Context }

class _reloadextensions extends Command {
  override def syntax =
    Syntax.commandSyntax("OTPL", true)
  override def perform(context: Context) {
    workspace.getExtensionManager.reset()
  }
}
