# Caleb_server


Caleb_Sever 에 대한 인스톨에 대한 정보를 기록해둔다. 


Installation
------------

메소스 인스톨에 대한 부분 기록해두기:

```
$ shell script
```

부가설명들
([링크 url](https://github.com/golang/go/wiki/Modules))

아래 하단 링크
[FAQ](#FAQ)

Prerequisites
-------------
- golang version 1.13 
  ```
  wget https://dl.google.com/go/go1.13.linux-amd64.tar.gz && tar -C /usr/local -xzf go1.13.linux-amd64.tar.gz

  // GOPATH, GOBIN, PATH 설정
  /etc/profile

  GOPATH=$HOME/go
  GOBIN=$GOPATH/bin
  PATH=$PATH:$GOPATH:$GOBIN:/usr/local/go/bin
  export GOPATH
  export GOBIN
  export PATH

  ```
- javafx 설치 및 버전 확인
  ```
  
  ```
- grpc-java version
- grpc-golnag
- grpc gogo
- aws 관련
- 메소스 관련 정리

Documentation
-------------
- See [godoc](https://godoc.org/google.golang.org/grpc) for package and API
  descriptions.
- Documentation on specific topics can be found in the [Documentation
  directory](Documentation/).
- Examples can be found in the [examples directory](examples/).

Performance
-----------
Performance benchmark data for grpc-go and other languages is maintained in
[this
dashboard](https://performance-dot-grpc-testing.appspot.com/explore?dashboard=5652536396611584&widget=490377658&container=1286539696).

Status
------
General Availability [Google Cloud Platform Launch
Stages](https://cloud.google.com/terms/launch-stages).

FAQ
---

#### I/O Timeout Errors

The `golang.org` domain may be blocked from some countries.  `go get` usually
produces an error like the following when this happens:

```
$ go get -u google.golang.org/grpc
package google.golang.org/grpc: unrecognized import path "google.golang.org/grpc" (https fetch: Get https://google.golang.org/grpc?go-get=1: dial tcp 216.239.37.1:443: i/o timeout)
```

To build Go code, there are several options:

- Set up a VPN and access google.golang.org through that.

- Without Go module support: `git clone` the repo manually:

  ```
  git clone https://github.com/grpc/grpc-go.git $GOPATH/src/google.golang.org/grpc
  ```

  You will need to do the same for all of grpc's dependencies in `golang.org`,
  e.g. `golang.org/x/net`.

- With Go module support: it is possible to use the `replace` feature of `go
  mod` to create aliases for golang.org packages.  In your project's directory:

  ```
  go mod edit -replace=google.golang.org/grpc=github.com/grpc/grpc-go@latest
  go mod tidy
  go mod vendor
  go build -
  ㅇㄹㅇㄹ
  ㅇㄹㅇㄹㅇ  
mod=vendor
  ```

  Again, this will need to be done for all transitive dependencies hosted on
  golang.org as well.  Please refer to [this
  issue](https://github.com/golang/go/issues/28652) in the golang repo regarding
  this concern.

#### Compiling error, undefined: grpc.SupportPackageIsVersion

Please update proto package, gRPC package and rebuild the proto files:
 - `go get -u github.com/golang/protobuf/{proto,protoc-gen-go}`
 - `go get -u google.golang.org/grpc`
 - `protoc --go_out=plugins=grpc:. *.proto`

#### How to turn on logging

The default logger is controlled by the environment variables. Turn everything
on by setting:

```
GRPC_GO_LOG_VERBOSITY_LEVEL=99 GRPC_GO_LOG_SEVERITY_LEVEL=info
```

#### The RPC failed with error `"code = Unavailable desc = transport is closing"`

This error means the connection the RPC is using was closed, and there are many
possible reasons, including:
 1. mis-configured transport credentials, connection failed on handshaking
 1. bytes disrupted, possibly by a proxy in between
 1. server shutdown

It can be tricky to debug this because the error happens on the client side but
the root cause of the connection being closed is on the server side. Turn on
logging on __both client and server__, and see if there are any transport
errors.
