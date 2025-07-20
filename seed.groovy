multibranchPipelineJob('cms') {
    branchSources {
        git {
            id('cms')
            remote('https://gitlab.com/greensight/ensi/cms/cms.git')
        }
    }
}