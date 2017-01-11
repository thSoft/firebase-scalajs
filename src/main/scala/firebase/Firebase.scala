import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

package firebase {

  @js.native
  trait FirebaseError extends js.Object {
    var code: String = js.native
    var message: String = js.native
    var name: String = js.native
    var stack: String = js.native
  }

  @js.native
  @JSName("firebase.Promise")
  class Promise[T] extends Promise_Instance[T] {
  }

  @js.native
  @JSName("firebase.Promise")
  object Promise extends js.Object {
    def all(values: js.Array[firebase.Promise[js.Any]]): firebase.Promise[js.Array[js.Any]] = js.native

    def reject(error: Error): firebase.Promise[js.Any] = js.native

    def resolve[T](value: T = ???): firebase.Promise[T] = js.native
  }

  @js.native
  @JSName("firebase.Promise_Instance")
  class Promise_Instance[T] protected() extends firebase.Thenable[js.Any] {
    def this(resolver: js.Function2[js.Function1[T, Unit], js.Function1[Error, Unit], Any]) = this()
  }

  @js.native
  trait Thenable[T] extends js.Object {
    def `catch`(onReject: js.Function1[Error, Any] = ???): js.Dynamic = js.native

    def then(onResolve: js.Function1[T, Any] = ???, onReject: js.Function1[Error, Any] = ???): firebase.Thenable[js.Any] = js.native
  }

  @js.native
  trait User extends firebase.UserInfo {
    def delete(): firebase.Promise[js.Any] = js.native

    var emailVerified: Boolean = js.native

    def getToken(forceRefresh: Boolean = ???): firebase.Promise[js.Any] = js.native

    var isAnonymous: Boolean = js.native

    def link(credential: firebase.auth.AuthCredential): firebase.Promise[js.Any] = js.native

    def linkWithPopup(provider: firebase.auth.AuthProvider): firebase.Promise[js.Any] = js.native

    def linkWithRedirect(provider: firebase.auth.AuthProvider): firebase.Promise[js.Any] = js.native

    var providerData: js.Array[firebase.UserInfo | Null] = js.native

    def reauthenticate(credential: firebase.auth.AuthCredential): firebase.Promise[js.Any] = js.native

    var refreshToken: String = js.native

    def reload(): firebase.Promise[js.Any] = js.native

    def sendEmailVerification(): firebase.Promise[js.Any] = js.native

    def unlink(providerId: String): firebase.Promise[js.Any] = js.native

    def updateEmail(newEmail: String): firebase.Promise[js.Any] = js.native

    def updatePassword(newPassword: String): firebase.Promise[js.Any] = js.native

    def updateProfile(profile: js.Any): firebase.Promise[js.Any] = js.native
  }

  @js.native
  trait UserInfo extends js.Object {
    var displayName: String | Null = js.native
    var email: String | Null = js.native
    var photoURL: String | Null = js.native
    var providerId: String = js.native
    var uid: String = js.native
  }

  package app {

    @js.native
    trait App extends js.Object {
      def auth(): firebase.auth.Auth = js.native

      def database(): firebase.database.Database = js.native

      def delete(): firebase.Promise[js.Any] = js.native

      var name: String = js.native
      var options: Object = js.native

      def storage(): firebase.storage.Storage = js.native
    }

  }

  package auth {

    @js.native
    trait ActionCodeInfo extends js.Object {
    }

    @js.native
    trait Auth extends js.Object {
      var app: firebase.app.App = js.native

      def applyActionCode(code: String): firebase.Promise[js.Any] = js.native

      def checkActionCode(code: String): firebase.Promise[js.Any] = js.native

      def confirmPasswordReset(code: String, newPassword: String): firebase.Promise[js.Any] = js.native

      def createCustomToken(uid: String, developerClaims: Object | Null = ???): String = js.native

      def createUserWithEmailAndPassword(email: String, password: String): firebase.Promise[js.Any] = js.native

      var currentUser: firebase.User | Null = js.native

      def fetchProvidersForEmail(email: String): firebase.Promise[js.Any] = js.native

      def getRedirectResult(): firebase.Promise[js.Any] = js.native

      def onAuthStateChanged(nextOrObserver: Object, error: js.Function1[firebase.auth.Error, Any] = ???, completed: js.Function0[Any] = ???): js.Function0[Any] = js.native

      def sendPasswordResetEmail(email: String): firebase.Promise[js.Any] = js.native

      def signInAnonymously(): firebase.Promise[js.Any] = js.native

      def signInWithCredential(credential: firebase.auth.AuthCredential): firebase.Promise[js.Any] = js.native

      def signInWithCustomToken(token: String): firebase.Promise[js.Any] = js.native

      def signInWithEmailAndPassword(email: String, password: String): firebase.Promise[js.Any] = js.native

      def signInWithPopup(provider: firebase.auth.AuthProvider): firebase.Promise[js.Any] = js.native

      def signInWithRedirect(provider: firebase.auth.AuthProvider): firebase.Promise[js.Any] = js.native

      def signOut(): firebase.Promise[js.Any] = js.native

      def verifyIdToken(idToken: String): firebase.Promise[js.Any] = js.native

      def verifyPasswordResetCode(code: String): firebase.Promise[js.Any] = js.native
    }

    @js.native
    trait AuthCredential extends js.Object {
      var provider: String = js.native
    }

    @js.native
    trait AuthProvider extends js.Object {
      var providerId: String = js.native
    }

    @js.native
    @JSName("firebase.auth.EmailAuthProvider")
    class EmailAuthProvider extends EmailAuthProvider_Instance {
    }

    @js.native
    @JSName("firebase.auth.EmailAuthProvider")
    object EmailAuthProvider extends js.Object {
      var PROVIDER_ID: String = js.native

      def credential(email: String, password: String): firebase.auth.AuthCredential = js.native
    }

    @js.native
    @JSName("firebase.auth.EmailAuthProvider_Instance")
    class EmailAuthProvider_Instance extends firebase.auth.AuthProvider {
    }

    @js.native
    trait Error extends js.Object {
      var code: String = js.native
      var message: String = js.native
    }

    @js.native
    @JSName("firebase.auth.FacebookAuthProvider")
    class FacebookAuthProvider extends FacebookAuthProvider_Instance {
    }

    @js.native
    @JSName("firebase.auth.FacebookAuthProvider")
    object FacebookAuthProvider extends js.Object {
      var PROVIDER_ID: String = js.native

      def credential(token: String): firebase.auth.AuthCredential = js.native
    }

    @js.native
    @JSName("firebase.auth.FacebookAuthProvider_Instance")
    class FacebookAuthProvider_Instance extends firebase.auth.AuthProvider {
      def addScope(scope: String): js.Dynamic = js.native


      def setCustomParameters(customOAuthParameters: Object): js.Dynamic = js.native
    }

    @js.native
    @JSName("firebase.auth.GithubAuthProvider")
    class GithubAuthProvider extends GithubAuthProvider_Instance {
    }

    @js.native
    @JSName("firebase.auth.GithubAuthProvider")
    object GithubAuthProvider extends js.Object {
      var PROVIDER_ID: String = js.native

      def credential(token: String): firebase.auth.AuthCredential = js.native
    }

    @js.native
    @JSName("firebase.auth.GithubAuthProvider_Instance")
    class GithubAuthProvider_Instance extends firebase.auth.AuthProvider {
      def addScope(scope: String): js.Dynamic = js.native


      def setCustomParameters(customOAuthParameters: Object): js.Dynamic = js.native
    }

    @js.native
    @JSName("firebase.auth.GoogleAuthProvider")
    class GoogleAuthProvider extends GoogleAuthProvider_Instance {
    }

    @js.native
    @JSName("firebase.auth.GoogleAuthProvider")
    object GoogleAuthProvider extends js.Object {
      var PROVIDER_ID: String = js.native

      def credential(idToken: String | Null = ???, accessToken: String | Null = ???): firebase.auth.AuthCredential = js.native
    }

    @js.native
    @JSName("firebase.auth.GoogleAuthProvider_Instance")
    class GoogleAuthProvider_Instance extends firebase.auth.AuthProvider {
      def addScope(scope: String): js.Dynamic = js.native


      def setCustomParameters(customOAuthParameters: Object): js.Dynamic = js.native
    }

    @js.native
    @JSName("firebase.auth.TwitterAuthProvider")
    class TwitterAuthProvider extends TwitterAuthProvider_Instance {
    }

    @js.native
    @JSName("firebase.auth.TwitterAuthProvider")
    object TwitterAuthProvider extends js.Object {
      var PROVIDER_ID: String = js.native

      def credential(token: String, secret: String): firebase.auth.AuthCredential = js.native
    }

    @js.native
    @JSName("firebase.auth.TwitterAuthProvider_Instance")
    class TwitterAuthProvider_Instance extends firebase.auth.AuthProvider {

      def setCustomParameters(customOAuthParameters: Object): js.Dynamic = js.native
    }

    @JSName("firebase.auth")
    @js.native
    object Auth extends js.Object {
      type UserCredential = js.Any
    }

  }

  package database {

    @js.native
    trait DataSnapshot extends js.Object {
      def child(path: String): firebase.database.DataSnapshot = js.native

      def exists(): Boolean = js.native

      def exportVal(): js.Dynamic = js.native

      def forEach(action: js.Function1[firebase.database.DataSnapshot, Boolean]): Boolean = js.native

      def getPriority(): String | Double | Null = js.native

      def hasChild(path: String): Boolean = js.native

      def hasChildren(): Boolean = js.native

      var key: String | Null = js.native

      def numChildren(): Double = js.native

      var ref: firebase.database.Reference = js.native

      def `val`(): js.Dynamic = js.native
    }

    @js.native
    trait Database extends js.Object {
      var app: firebase.app.App = js.native

      def goOffline(): js.Dynamic = js.native

      def goOnline(): js.Dynamic = js.native

      def ref(path: String = ???): firebase.database.Reference = js.native

      def refFromURL(url: String): firebase.database.Reference = js.native
    }

    @js.native
    trait OnDisconnect extends js.Object {
      def cancel(onComplete: js.Function1[Error | Null, Any] = ???): firebase.Promise[js.Any] = js.native

      def remove(onComplete: js.Function1[Error | Null, Any] = ???): firebase.Promise[js.Any] = js.native

      def set(value: js.Any, onComplete: js.Function1[Error | Null, Any] = ???): firebase.Promise[js.Any] = js.native

      def setWithPriority(value: js.Any, priority: Double | String | Null, onComplete: js.Function1[Error | Null, Any] = ???): firebase.Promise[js.Any] = js.native

      def update(values: Object, onComplete: js.Function1[Error | Null, Any] = ???): firebase.Promise[js.Any] = js.native
    }

    @js.native
    trait Query extends js.Object {
      def endAt(value: Double | String | Boolean | Null, key: String = ???): firebase.database.Query = js.native

      def equalTo(value: Double | String | Boolean | Null, key: String = ???): firebase.database.Query = js.native

      def isEqual(other: firebase.database.Query | Null): Boolean = js.native

      def limitToFirst(limit: Double): firebase.database.Query = js.native

      def limitToLast(limit: Double): firebase.database.Query = js.native

      def off(eventType: String = ???, callback: js.Function2[firebase.database.DataSnapshot, String | Null, Any] = ???, context: Object | Null = ???): js.Dynamic = js.native

      def on(eventType: String, callback: js.Function2[firebase.database.DataSnapshot, String | Null, Any], cancelCallbackOrContext: Object | Null = ???, context: Object | Null = ???): js.Function2[firebase.database.DataSnapshot, String | Null, Any] = js.native

      def once(eventType: String, successCallback: js.Function2[firebase.database.DataSnapshot, String | Null, Any] = ???, failureCallbackOrContext: Object | Null = ???, context: Object | Null = ???): firebase.Promise[js.Any] = js.native

      def orderByChild(path: String): firebase.database.Query = js.native

      def orderByKey(): firebase.database.Query = js.native

      def orderByPriority(): firebase.database.Query = js.native

      def orderByValue(): firebase.database.Query = js.native

      var ref: firebase.database.Reference = js.native

      def startAt(value: Double | String | Boolean | Null, key: String = ???): firebase.database.Query = js.native

      override def toString(): String = js.native
    }

    @js.native
    trait Reference extends firebase.database.Query {
      def child(path: String): firebase.database.Reference = js.native

      var key: String | Null = js.native

      def onDisconnect(): firebase.database.OnDisconnect = js.native

      var parent: firebase.database.Reference | Null = js.native

      def push(value: js.Any = ???, onComplete: js.Function1[Error | Null, Any] = ???): firebase.database.ThenableReference = js.native

      def remove(onComplete: js.Function1[Error | Null, Any] = ???): firebase.Promise[js.Any] = js.native

      var root: firebase.database.Reference = js.native

      def set(value: js.Any, onComplete: js.Function1[Error | Null, Any] = ???): firebase.Promise[js.Any] = js.native

      def setPriority(priority: String | Double | Null, onComplete: js.Function1[Error | Null, Any]): firebase.Promise[js.Any] = js.native

      def setWithPriority(newVal: js.Any, newPriority: String | Double | Null, onComplete: js.Function1[Error | Null, Any] = ???): firebase.Promise[js.Any] = js.native

      def transaction(transactionUpdate: js.Function1[js.Any, Any], onComplete: js.Function3[Error | Null, Boolean, firebase.database.DataSnapshot | Null, Any] = ???, applyLocally: Boolean = ???): firebase.Promise[js.Any] = js.native

      def update(values: Object, onComplete: js.Function1[Error | Null, Any] = ???): firebase.Promise[js.Any] = js.native
    }

    @js.native
    trait ThenableReference extends firebase.database.Reference with firebase.Thenable[js.Any] {
    }

    package ServerValue {

      @JSName("firebase.database.ServerValue")
      @js.native
      object ServerValue extends js.Object {
        var TIMESTAMP: Object = js.native
      }

    }

    @JSName("firebase.database")
    @js.native
    object Database extends js.Object {
      def enableLogging(enabled: Boolean = ???, persistent: Boolean = ???): js.Dynamic = js.native
    }

  }

  package messaging {

    @js.native
    trait Messaging extends js.Object {
      def deleteToken(token: String): firebase.Promise[js.Any] | Null = js.native

      def getToken(): firebase.Promise[js.Any] | Null = js.native

      def onMessage(nextOrObserver: Object): js.Function0[Any] = js.native

      def onTokenRefresh(nextOrObserver: Object): js.Function0[Any] = js.native

      def requestPermission(): firebase.Promise[js.Any] | Null = js.native

      def setBackgroundMessageHandler(callback: js.Function1[Object, Any]): js.Dynamic = js.native

      def useServiceWorker(registration: js.Any): js.Dynamic = js.native
    }

  }

  package storage {

    @js.native
    trait FullMetadata extends firebase.storage.UploadMetadata {
      var bucket: String = js.native
      var downloadURLs: js.Array[String] = js.native
      var fullPath: String = js.native
      var generation: String = js.native
      var metageneration: String = js.native
      var name: String = js.native
      var size: Double = js.native
      var timeCreated: String = js.native
      var updated: String = js.native
    }

    @js.native
    trait Reference extends js.Object {
      var bucket: String = js.native

      def child(path: String): firebase.storage.Reference = js.native

      def delete(): firebase.Promise[js.Any] = js.native

      var fullPath: String = js.native

      def getDownloadURL(): firebase.Promise[js.Any] = js.native

      def getMetadata(): firebase.Promise[js.Any] = js.native

      var name: String = js.native
      var parent: firebase.storage.Reference | Null = js.native

      def put(data: js.Any, metadata: firebase.storage.UploadMetadata = ???): firebase.storage.UploadTask = js.native

      def putString(data: String, format: firebase.storage.Storage.StringFormat = ???, metadata: firebase.storage.UploadMetadata = ???): firebase.storage.UploadTask = js.native

      var root: firebase.storage.Reference = js.native
      var storage: firebase.storage.Storage = js.native

      override def toString(): String = js.native

      def updateMetadata(metadata: firebase.storage.SettableMetadata): firebase.Promise[js.Any] = js.native
    }

    @js.native
    trait SettableMetadata extends js.Object {
      var cacheControl: String | Null = js.native
      var contentDisposition: String | Null = js.native
      var contentEncoding: String | Null = js.native
      var contentLanguage: String | Null = js.native
      var contentType: String | Null = js.native
      var customMetadata: js.Dictionary[String] | Null = js.native
    }

    @js.native
    trait Storage extends js.Object {
      var app: firebase.app.App = js.native
      var maxOperationRetryTime: Double = js.native
      var maxUploadRetryTime: Double = js.native

      def ref(path: String = ???): firebase.storage.Reference = js.native

      def refFromURL(url: String): firebase.storage.Reference = js.native

      def setMaxOperationRetryTime(time: Double): js.Dynamic = js.native

      def setMaxUploadRetryTime(time: Double): js.Dynamic = js.native
    }

    @js.native
    @JSName("firebase.storage.StringFormat")
    object StringFormat extends js.Object {
      var BASE64: firebase.storage.Storage.StringFormat = js.native
      var BASE64URL: firebase.storage.Storage.StringFormat = js.native
      var DATA_URL: firebase.storage.Storage.StringFormat = js.native
      var RAW: firebase.storage.Storage.StringFormat = js.native
    }

    @js.native
    @JSName("firebase.storage.TaskEvent")
    object TaskEvent extends js.Object {
      var STATE_CHANGED: firebase.storage.Storage.TaskEvent = js.native
    }

    @js.native
    @JSName("firebase.storage.TaskState")
    object TaskState extends js.Object {
      var CANCELED: firebase.storage.Storage.TaskState = js.native
      var ERROR: firebase.storage.Storage.TaskState = js.native
      var PAUSED: firebase.storage.Storage.TaskState = js.native
      var RUNNING: firebase.storage.Storage.TaskState = js.native
      var SUCCESS: firebase.storage.Storage.TaskState = js.native
    }

    @js.native
    trait UploadMetadata extends firebase.storage.SettableMetadata {
      var md5Hash: String | Null = js.native
    }

    @js.native
    trait UploadTask extends js.Object {
      def cancel(): Boolean = js.native

      def `catch`(onRejected: js.Function1[Error, Any]): firebase.Promise[js.Any] = js.native

      def on(event: firebase.storage.Storage.TaskEvent, nextOrObserver: Null | Object = ???, error: js.Function1[Error, Any] | Null = ???, complete: js.Function0[Any] | Null = ???): js.Function = js.native

      def pause(): Boolean = js.native

      def resume(): Boolean = js.native

      var snapshot: firebase.storage.UploadTaskSnapshot = js.native

      def then(onFulfilled: js.Function1[firebase.storage.UploadTaskSnapshot, Any] | Null = ???, onRejected: js.Function1[Error, Any] | Null = ???): firebase.Promise[js.Any] = js.native
    }

    @js.native
    trait UploadTaskSnapshot extends js.Object {
      var bytesTransferred: Double = js.native
      var downloadURL: String | Null = js.native
      var metadata: firebase.storage.FullMetadata = js.native
      var ref: firebase.storage.Reference = js.native
      var state: firebase.storage.Storage.TaskState = js.native
      var task: firebase.storage.UploadTask = js.native
      var totalBytes: Double = js.native
    }

    @JSName("firebase.storage")
    @js.native
    object Storage extends js.Object {
      type StringFormat = String
      type TaskEvent = String
      type TaskState = String
    }

  }

  @JSName("firebase")
  @js.native
  object Firebase extends js.Object {
    var SDK_VERSION: String = js.native

    def app(name: String = ???): firebase.app.App = js.native

    var apps: js.Array[firebase.app.App | Null] = js.native

    def auth(app: firebase.app.App = ???): firebase.auth.Auth = js.native

    def database(app: firebase.app.App = ???): firebase.database.Database = js.native

    def initializeApp(options: FirebaseConfig, name: String = ???): firebase.app.App = js.native

    def messaging(app: firebase.app.App = ???): firebase.messaging.Messaging = js.native

    def storage(app: firebase.app.App = ???): firebase.storage.Storage = js.native
  }

  @JSExportAll
  case class FirebaseConfig(
    apiKey: String,
    authDomain: String,
    databaseURL: String,
    storageBucket: String,
    messagingSenderId: String
  )

}