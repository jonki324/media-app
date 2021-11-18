import React from 'react';
import { Grid, Card, CardContent, Typography } from '@mui/material';
import { DesktopMac, Build, ContactMail } from '@mui/icons-material';
import Layout from '../../components/Layout/Layout';

const AboutPage: React.FC = () => {
  const aboutTitle = 'About Title Dummy';
  const aboutBody =
    'Contents Body, Contents Body, Contents Body, Contents Body, Contents Body, Contents Body, Contents Body, Contents Body, Contents Body.';
  return (
    <Layout>
      <Grid container justifyContent="center" spacing={2} pt={4}>
        <Grid item maxWidth="md" xs={12}>
          <Card>
            <CardContent>
              <Grid container spacing={2}>
                <Grid item md={3}>
                  <DesktopMac sx={{ width: '100%', height: '100%' }} />
                </Grid>
                <Grid item md={9}>
                  <Typography variant="h5">{aboutTitle}</Typography>
                  <Typography variant="body2">{aboutBody}</Typography>
                </Grid>
              </Grid>
            </CardContent>
          </Card>
        </Grid>
        <Grid item maxWidth="md" xs={12}>
          <Card>
            <CardContent>
              <Grid container spacing={2}>
                <Grid item md={9}>
                  <Typography variant="h5">{aboutTitle}</Typography>
                  <Typography variant="body2">{aboutBody}</Typography>
                </Grid>
                <Grid item md={3}>
                  <Build sx={{ width: '100%', height: '100%' }} />
                </Grid>
              </Grid>
            </CardContent>
          </Card>
        </Grid>
        <Grid item maxWidth="md" xs={12}>
          <Card>
            <CardContent>
              <Grid container spacing={2}>
                <Grid item md={3}>
                  <ContactMail sx={{ width: '100%', height: '100%' }} />
                </Grid>
                <Grid item md={9}>
                  <Typography variant="h5">{aboutTitle}</Typography>
                  <Typography variant="body2">{aboutBody}</Typography>
                </Grid>
              </Grid>
            </CardContent>
          </Card>
        </Grid>
      </Grid>
    </Layout>
  );
};

export default AboutPage;
