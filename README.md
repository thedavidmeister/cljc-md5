# cljc-md5

No frills string to hex string md5 hashing.

Works across both Clojure and Clojurescript as a thin wrapper for existing rock
solid crypto.

Clojure wraps `java.security.MessageDigest`.

ClojureScript wraps `goog.crypt.Md5`.

## Installation

[![Clojars Project](https://img.shields.io/clojars/v/thedavidmeister/cljc-md5.svg)](https://clojars.org/thedavidmeister/cljc-md5)

[![CircleCI](https://circleci.com/gh/thedavidmeister/cljc-md5/tree/master.svg?style=svg)](https://circleci.com/gh/thedavidmeister/cljc-md5/tree/master)

## Usage

Only one fn is provided `md5.core/string->md5-hex`.

String goes in, md5 hex string comes out. Simple 😃.

Simple example, hashing an email for use in [Gravatar](gravatar.com) URLs.

```clojure
(md5.core/string->md5-hex "foo@example.com") ; "b48def645758b95537d4424c84d1a9ff"
```

## Do NOT use with passwords

md5 hashes are NOT suitable for use with passwords in any way, shape or form.
