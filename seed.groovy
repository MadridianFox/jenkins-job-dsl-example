multibranchPipelineJob('cms') {
    branchSources {
        git {
            id('cms')
            remote('https://gitlab.com/greensight/ensi/cms/cms.git')
        }
    }

    configFiles {
        customConfig {
            id("env")
            name("env")
            comment("")
            content("""
            BANANA=ananas
            """)
        }
    }
}