addSbtPlugin("org.scalameta" % "sbt-mdoc" % "2.6.2")

fullResolvers ~= {_.filterNot(_.name == "jcenter")}

addSbtPlugin("com.github.xuwei-k" % "sbt-class-diagram" % "0.3.0")
