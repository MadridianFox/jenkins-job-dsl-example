folder("dev") {}

def ensiApps = [
  [
    repo: 'https://gitlab.com/greensight/ensi/cms/cms.git',
    name: 'cms',
  ]
]

ensiApps.each { app ->
  multibranchPipelineJob("dev/${app.name}") {
      branchSources {
          git {
              id(app.name)
              remote(app.repo)
          }
      }
      properties {
          folderConfigFiles {
              configs {
                  customConfig {
                      id("env")
                      name("env")
                      comment("")
                      content("""
  RELEASE=${app.name}
  IMAGE=ensi/${app.name}
  """)
                  }
              }
          }
      }
  }
}
