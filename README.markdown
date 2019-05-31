A [Giter8][g8] template for a basic http4s client project.

Template license
----------------

2018-08-13 Inner-Product

Contributors: (Add your name as applicable)

- Mark Mynsted
- Noel Welsh

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/

## Note 

This template uses the g8 ability to determine the latest stable release of
a library stored in a maven repository. There is currently an `sbt` defect that
prevents `sbt new templatename` from working. It is issue
[#3997](https://github.com/sbt/sbt/issues/3977). Use `g8` directly when
building projects from this template until the issue with `sbt` is resolved. 

It is fairly simple to install `g8`.  Then one may use `g8` to generate the
project from the template. 

If you would normally do this:

`sbt new eed3si9n/hello.g8`

You would do this:

`g8 eed3si9n/hello.g8`
