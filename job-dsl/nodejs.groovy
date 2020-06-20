job('NodeJS-DSL-Demo') {
    scm {
        git('git://github.com/japneet-sahni/nodejs-docker-demo.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('Japneet Sahni')
            node / gitConfigEmail('japneet@example.com')
        }
    }
    //triggers {
    //    scm('H/5 * * * *')
    //}
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        export PATH="${NODEJS_HOME}/bin:${PATH}"
        shell("npm install")
    }
}
