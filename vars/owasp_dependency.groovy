#def call(){
#  dependencyCheck additionalArguments: '--scan ./', odcInstallation: 'OWASP'
#  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
#}

def call(){
  dependencyCheck additionalArguments: '--scan . --format XML --out .',
                  odcInstallation: 'OWASP'

  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}

