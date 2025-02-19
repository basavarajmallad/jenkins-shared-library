def call(cmd) {
 echo "  this stage will genrate the artifact of ${cmd} "
 sh "mvn clean package"
}
